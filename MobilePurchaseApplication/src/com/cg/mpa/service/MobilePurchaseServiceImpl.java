package com.cg.mpa.service;

import java.util.List;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mpa.dao.MobileDao;
import com.cg.mpa.dao.PurchaseDetailsDao;
import com.cg.mpa.entities.Mobile;
import com.cg.mpa.entities.PurchaseDetails;

@Transactional
@Service
public class MobilePurchaseServiceImpl implements MobilePurchaseService{
	@Autowired
	MobileDao mdao;
	@Autowired
	PurchaseDetailsDao pdao;
	@Override
	public List<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return mdao.fetchAllMobiles();
	}
	@Override
	public void insertPurchasedetails(PurchaseDetails pdetails) {
		// TODO Auto-generated method stub
		pdao.insertPurchaseDetails(pdetails);
	}
	
	

}
