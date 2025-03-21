package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountHolderTest {
    // getName
    @Test
    public void testGetNameSuccess(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);

        // Expected
        String expected = "Dennis Olsen";

        // Actual
        String actual = person.getName();


        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    // setName
    @Test
    public void testSetNameSuccessRightPassword(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);
        String newName = "Johan Olsen";

        // Expected
        boolean expectedReturn = true;
        String expectedName = "Johan Olsen";

        // Actual
        boolean actualReturn = person.setName(newName, "123456");


        // Verify the result
        Assertions.assertEquals(expectedReturn, actualReturn);
        Assertions.assertEquals(expectedName, person.getName());
    }
    @Test
    public void testSetNameFailureWrongPassword(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);
        String newName = "Johan Olsen";

        // Expected
        boolean expectedReturn = false;
        String expectedName = "Dennis Olsen";

        // Actual
        boolean actualReturn = person.setName(newName, "53245");


        // Verify the result
        Assertions.assertEquals(expectedReturn, actualReturn);
        Assertions.assertEquals(expectedName, person.getName());
    }

    // getAccountId
    @Test
    public void testGetAccountIdSuccess(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);


        // Expected maximum value is 5


        // Actual maximum value should generate bbu the implemented logic


        // Verify the result
    }

    // Get/set Balance
    @Test
    public void testGetBalanceSuccess(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);

        // Expected
        double expected = 10000;

        // Actual
        double actual = person.getBalance();

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetBalanceSuccess(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);

        // Expected
        double expected = 90;

        // Actual
        person.setBalance(expected);
        double actual = person.getBalance();

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    // Get/set Password
    @Test
    public void testGetPasswordSuccess(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);

        // Expected
        String expected = "123456";

        // Actual
        String actual = person.getPassword();

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPasswordSuccessRightCurrentPassword(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);
        String oldPassword = "123456";
        String newPassword = "987123";

        // Expected
        boolean expectedReturn = true;
        String expectedPassword = newPassword;

        // Actual
        boolean actualReturn = person.setPassword(oldPassword, newPassword);

        // Verify the result
        Assertions.assertEquals(expectedReturn, actualReturn);
        Assertions.assertEquals(expectedPassword, person.getPassword());
    }
    @Test
    public void testSetPasswordFailureWrongCurrentPassword(){
        // Test logic here
        // Scenario:
        AccountHolder person = new AccountHolder("Dennis Olsen", "123456", 10000);
        String oldPassword = "765464";
        String newPassword = "987123";

        // Expected
        boolean expectedReturn = false;
        String expectedPassword = "123456";

        // Actual
        boolean actualReturn = person.setPassword(oldPassword, expectedPassword);

        // Verify the result
        Assertions.assertEquals(expectedReturn, actualReturn);
        Assertions.assertEquals(expectedPassword, person.getPassword());
    }

}
