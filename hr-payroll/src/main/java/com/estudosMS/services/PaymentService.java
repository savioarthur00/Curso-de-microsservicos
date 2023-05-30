package com.estudosMS.services;

import org.springframework.stereotype.Service;

import com.estudosMS.entites.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment (Long workedId, int days) {
		
		return new Payment("Bob",200.0,days);
		
	}

}
