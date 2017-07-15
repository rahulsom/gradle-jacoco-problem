package m2;

import org.junit.Assert;
import org.junit.Test;

public class ThingTest {
    @Test
    public void diff() throws Exception {
        Assert.assertEquals(1, new Thing().diff(4,3));
    }

}