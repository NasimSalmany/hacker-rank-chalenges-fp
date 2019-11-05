import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Nasim Salmany
 */

public class SockMerchantTest {

    @Test
    public void success_get_socks_pair_count(){
        int[] socks = {1, 2, 22, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 40, 7, 10, 2, 5, 4, 8, 13};
        int sockPairCount = SockMerchant.getSockPairCount(20, socks);
        System.out.println("pairs: " + sockPairCount);
        assertThat(sockPairCount, equalTo(7));
    }

}
