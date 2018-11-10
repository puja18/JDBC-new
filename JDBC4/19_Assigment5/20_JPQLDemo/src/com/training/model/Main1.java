package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import oracle.net.aso.p;

public class Main1 {
	public static void main(String[] args) {
		String jpql = "select person from Person person where person.gender = 'M' and person.salary between :startRange and :EndRange ";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery(jpql);
		query.setParameter("startRange", 5000.00);
		query.setParameter("EndRange", 19000.00);
		List<Person> persons = query.getResultList();
		for (Person person : persons) {
			System.out.print(person.getName() + "\t");
			System.out.print(person.getSalary() + "\t");
			System.out.print(person.getGender() + "\t");
			System.out.println(person.getAge() + "\t");
		}
		
	}

}
