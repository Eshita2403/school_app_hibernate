package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;

public class ReferenceDao {
	
		public ReferenceBook saveBook(ReferenceBook rb) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(rb);
			
			entityTransaction.commit();
			
			return rb;
		}
		public ReferenceBook findUserById(int id) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			ReferenceBook referenceBook = entityManager.find(ReferenceBook.class, 1);
			if(referenceBook!=null) {
				
				return referenceBook;
			}
			else
				
			return null;
		}

		public boolean deleteBook(int id) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction et = entityManager.getTransaction();
			ReferenceBook rb = entityManager.find(ReferenceBook.class, 1);
			if(rb!=null) {
				
				et.begin();
				entityManager.remove(rb);
				et.commit();
				return true;
			}
			else
				
			return true;
		}
		public ReferenceBook updateStudent(ReferenceBook rb) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			EntityTransaction et = entityManager.getTransaction();
			
			et.begin();
			entityManager.merge(rb);
			et.commit();
			
			System.out.println("student data updated");

			return rb;	
	}
}


