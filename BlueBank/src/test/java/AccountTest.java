import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AccountTest {
	
	private Account account;

	@Before
	public void setUp() throws Exception {
		
		String accountID = "123456";
        double startBalanceCL = 1000000;
        double startBalanceUSD = 0;
        ArrayList<String> userHistory = new ArrayList<String>();
		
		account = new Account(accountID,startBalanceCL,startBalanceUSD,userHistory);
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetID() throws Exception {
		
		// Given

		// When

		//Then
		Assert.assertTrue(account.getID().equals("123456"));

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalanceCL() throws Exception {
		
		// Given
		double balanceCL = 1000000;
		
		// When

		//Then
		Assert.assertTrue(account.getBalanceCL() == balanceCL);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalanceUSD() throws Exception {
		
		// Given
		double balanceUSD = 0;
		
		// When

		//Then
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);

	}

	@SuppressWarnings("deprecation")
	@Test
	// Add over the minimum
	public void testAddCLPFunds1() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 200000;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceCLP = 1200000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Add the minimum
	public void testAddCLPFunds2() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 2000;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceCLP = 1002000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Add below the minimum
	public void testAddCLPFunds3() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 200;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceCLP = 1000000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Add over the minimum
	public void testAddUSDFunds1() throws Exception {
		
		// Given
		String currency = "USD";
		double amount = 150;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceUSD = 150;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Add the minimum
	public void testAddUSDFunds2() throws Exception {
		
		// Given
		String currency = "USD";
		double amount = 10;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceUSD = 10;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Add below the minimum
	public void testAddUSDFunds3() throws Exception {
		
		// Given
		String currency = "USD";
		double amount = 5;
		
		// When
		account.addFunds(amount, currency);

		//Then
		double balanceUSD = 0;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);

	}

	@SuppressWarnings("deprecation")
	@Test
	// Withdraw over the maximum
	public void testWithdrawCLPFunds1() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 250000;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceCLP = 1000000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw the maximum
	public void testWithdrawCLPFunds2() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 200000;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceCLP = 800000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw below the maximum
	public void testWithdrawCLPFunds3() throws Exception {
		
		// Given
		String currency = "CLP";
		double amount = 100000;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceCLP = 900000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw more than available
	public void testWithdrawCLPFunds4() throws Exception {
		
		// Given
		account.setBalanceCL(150000);
		String currency = "CLP";
		double amount = 180000;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceCLP = 150000;
		Assert.assertTrue(account.getBalanceCL() == balanceCLP);

	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw over the maximum
	public void testWithdrawUSDFunds1() throws Exception {
		
		// Given
		account.setBalanceUSD(300);
		String currency = "USD";
		double amount = 250;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceUSD = 300;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);
	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw the maximum
	public void testWithdrawUSDFunds2() throws Exception {
		
		// Given
		account.setBalanceUSD(300);
		String currency = "USD";
		double amount = 200;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceUSD = 100;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);
	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw below the maximum
	public void testWithdrawUSDFunds3() throws Exception {
		
		// Given
		account.setBalanceUSD(300);
		String currency = "USD";
		double amount = 100;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceUSD = 200;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);
	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	// Withdraw more than available
	public void testWithdrawUSDFunds4() throws Exception {
		
		// Given
		account.setBalanceUSD(150);
		String currency = "USD";
		double amount = 180;
		
		// When
		account.withdrawFunds(amount, currency);

		//Then
		double balanceUSD = 150;
		Assert.assertTrue(account.getBalanceUSD() == balanceUSD);
	
	}


}
