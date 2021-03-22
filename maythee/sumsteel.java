import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class sumsteel {
    public static void main(String[] args) {
        int K = 500;
        List<Integer> inputs = Arrays.asList(195,195,90,90,60,60,150,150);

        int opt = 0;                // optimal solution so far          

        Set<Integer> sums = new HashSet<>();
        sums.add(opt);

        // loop over all input values
        for (Integer input : inputs) {
            Set<Integer> newSums = new HashSet<>();

            // loop over all sums so far                        
            for (Integer sum : sums) {
                int newSum = sum + input;

                // ignore too big sums
                if (newSum <= K) {
                    newSums.add(newSum);

                    // update optimum                       
                    if (newSum > opt) {
                        opt = newSum;
                    }
                }
            }

            sums.addAll(newSums);
        }

        System.out.println(opt);
    }
}