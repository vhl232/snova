package recursiya.tests;

import org.junit.Assert;
import org.junit.Test;
import recursiya.Factorial;

public class Test1 {

    @Test
    public void check10() {


        double result = Factorial.facCicle(10);

        Assert.assertEquals(3628800L, (long) result);

    }


    @Test
    public void check0() {

        Assert.assertEquals(1L, (long) Factorial.facCicle(0));

    }
}
