package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;


public class StudentDao {
	public Student saveStudent(Student student) {
		

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	public Student findUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, 1);
		if(student!=null) {
			return student;
		}
		else
			
			return null;
	}

	public boolean deleteStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		Student stu = entityManager.find(Student.class, 1);
		if(stu!=null) {
			
			et.begin();
			entityManager.remove(stu);
			et.commit();
			return true;

		}
		else
		return false;
	}
	public Student updateStudent(Student stu) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction et = entityManager.getTransaction();
		
		et.begin();
		entityManager.merge(stu);
		et.commit();

		return stu;	
	}
}
