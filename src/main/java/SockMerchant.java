import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Nasim Salmany
 */
public class SockMerchant {

    // the sockMerchant function
    static int getSockPairCount(int n, int[] ar) {
        return Arrays.stream(ar).boxed().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .mapToInt(a -> (int) (a / 2)).sum();
    }
}
