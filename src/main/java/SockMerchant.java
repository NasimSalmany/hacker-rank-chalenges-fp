
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Nasim Salmany
 */
public class SockMerchant {

    // the sockMerchant function.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Long> collect = Arrays.stream(ar).boxed().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int pairs = 0;
        for (Long i : collect.values()) {
            pairs += (int) (i / 2);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] socks = {1, 2, 22, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 40, 7, 10, 2, 5, 4, 8, 13};
        int pairs = sockMerchant(20, socks);
        System.out.println("There are " + pairs + " pairs in the basket");
    }

}
