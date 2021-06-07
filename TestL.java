package calculator;
import java.util.*;

public class TestL {
    
	Loan l=new Loan();

	@Test
	public void testHomeLoan() {
		
		assert(l.homeLoan(100, 5)==4200);
	}

	@Test
	public void testCarLoan() {
		//fail("Not yet implemented");
	}

	@Test
	public void testPersonalLoan() {
		//fail("Not yet implemented");
	}


}
