package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("debit")
public class DebitCardPayment implements Ipayment {

	@Override
	public boolean doPayment() {
		System.out.println("DebitCardPayment done");
		return true;
	}
	

}
