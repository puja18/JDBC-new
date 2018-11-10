package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Person person = new Person("sai", 21, 15000, 'F');
		Person person1 = new Person("hima", 22, 18000, 'F');
		Person person2 = new Person("mahi", 25, 14000, 'M');
		Person person3 = new Person("raju", 28, 19000, 'M');
		Person person4 = new Person("kiran", 24, 12000, 'M');
		em.persist(person);
		em.persist(person1);
		em.persist(person2);
		em.persist(person3);
		em.persist(person4);
		
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
