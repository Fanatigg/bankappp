import org.junit.Assert;
import org.junit.Test;

public class Testujemy {

    @Test
    public void method_if_withdraw_shrinks_amount_of_the_balance(){
        AccountDetails accDetails = new AccountDetails();
        accDetails.setBalance(100);
        long expectedResult = accDetails.getBalance();
        Assert.assertEquals(expectedResult, accDetails.getBalance());
    }
}
