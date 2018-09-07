package com.cg.mpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mpa.entities.Mobile;
import com.cg.mpa.entities.PurchaseDetails;
@Service
public interface MobilePurchaseService {
	List<Mobile> getAllMobiles();
	void insertPurchasedetails(PurchaseDetails pdetails);
}
