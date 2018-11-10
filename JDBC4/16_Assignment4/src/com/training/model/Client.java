package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new loan
		Loan loan = new Loan();
		loan.setLoanId(2);
		loan.setCustomerName("Radha");
		loan.setLoanAmount(20000.00);
		
		//create two installments for repay
		
		/*RePayment rePayment = new RePayment();
		rePayment.setRePaymentId(1);
		rePayment.setInatllementNum(1);
		rePayment.setRePayAmount(25000.00);
		
		RePayment rePayment1 = new RePayment();
		rePayment1.setRePaymentId(2);
		rePayment1.setInatllementNum(2);
		rePayment1.setRePayAmount(10000.00);*/
		
		RePayment payment = new RePayment(3, 10000.00 ,1);
		RePayment payment1 = new RePayment(4, 10000.00 ,2);
		
		
		//loan.addRepayment(rePayment);
		//loan.addRepayment(rePayment1);
		loan.addRepayment(payment);
		loan.addRepayment(payment1);
		
		em.persist(loan);
		System.out.println("installements are added");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
		
		

		
		
		
		

}


