import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Create by hieuduong on 10/7/17
 */
public class MyIntegerTest {
    @org.junit.Test
    public void isEven()  {
        MyInteger myInt = new MyInteger(12);
        Assert.assertEquals("Error", true, myInt.isEven());

        System.out.println(myInt.getValue() + " is even: "+myInt.isEven());
    }

}