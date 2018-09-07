package com.cg.mpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.mpa.entities.PurchaseDetails;
@Repository
public class PurchaseDetailsImpl implements PurchaseDetailsDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertPurchaseDetails(PurchaseDetails pdetails) {
		// TODO Auto-generated method stub
		em.persist(pdetails);
	}
	
}
