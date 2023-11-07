import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Sum of 2 numbers")
    public void doSum(){
        CalcScreen calcScreen = new CalcScreen(driver);
        //String res = calcScreen.doSum(5, 3);
        String res = calcScreen.doSum(8,2);
        Assert.assertEquals(res, "10");
    }

    @Test(priority = 2, description = "Sub of 2 numbers")
    public void doSub(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String res = calcScreen.doSub(8,2);
        Assert.assertEquals(res, "6");
    }

    @Test(priority = 3, description = "Multiple of 2 numbers")
    public void doMulti(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String res = calcScreen.doMulti(8,2);
        Assert.assertEquals(res, "16");
    }

    @Test(priority = 4, description = "Division of 2 numbers")
    public void doDiv(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String res = calcScreen.doDiv(8,2);
        Assert.assertEquals(res, "4");
    }

    @AfterMethod
    public void clear(){
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
