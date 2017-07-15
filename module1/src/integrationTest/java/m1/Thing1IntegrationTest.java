package m1;

import org.junit.Assert;
import org.junit.Test;

public class Thing1IntegrationTest {
    @Test
    public void testSum() {
        Assert.assertEquals(3, new Thing().sum(1,2));
    }
}
