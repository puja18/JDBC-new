package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Department department = em.find(Department.class, 10);
		System.out.println(department.getName()+","+department.getEmployees().size());
		for (Employee employee : department.getEmployees()) {
			System.out.println(employee.getName() + "," + employee.getSalary());
		}
		em.close();
		factory.close();

	}

}
