package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("salaryFilterQuery");
		List<Person> persons = query.getResultList();
		for (Person person : persons) {
			System.out.print(person.getName() + "\t");
			System.out.print(person.getSalary() + "\t");
			System.out.print(person.getGender() + "\t");
			System.out.println(person.getAge() + "\t");
		}
		

	}

}
