package com.cg.mpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mpa.dao.MobileDao;
import com.cg.mpa.entities.Mobile;

@Repository
public class MobileDaoImpl implements MobileDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Mobile> fetchAllMobiles() {
		String jqpl="Select m from Mobile m";
		TypedQuery<Mobile> query=em.createQuery(jqpl,Mobile.class);
		return query.getResultList();
	}
}
