
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.cbh.CBH;

public class CBHT {
    ru.netology.cbh.CBH cash = new CBH();
    @Test
    public void boundaryTest(){
        int amount = 2500;

        int expected = 500;
        int actual = cash.remain(amount);
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void boundaryTest1(){
        int amount = 0;

        int expected = 1000;
        int actual = cash.remain(amount);
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void boundaryTest12(){
        int amount = 1000;

        int expected = 0;
        int actual = cash.remain(amount);
        Assert.assertEquals(actual,expected);

    }
}