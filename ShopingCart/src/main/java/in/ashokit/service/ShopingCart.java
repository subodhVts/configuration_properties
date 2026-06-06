package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.dao.Ipayment;

@Service
public class ShopingCart {
	
	@Autowired
	@Qualifier("debit")
	private Ipayment payment;

//	public ShopingCart(Ipayment payment) {
//		
//		this.payment = payment;
//	}
//
//   public void setPayment(Ipayment payment) {
//		this.payment = payment;
//	}
   
   public void payment() {
	   boolean doPayment = payment.doPayment();
	   if(doPayment) {
		   System.out.println("payement done");
	   }
	   
	   
   }
	
	
	
	

}
