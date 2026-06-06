package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("credit")
//@Primary
public class CreeditCardPayment implements Ipayment {

	@Override
	public boolean doPayment() {
		System.out.println("CreeditCardPayment done");
		return true;
	}

}
