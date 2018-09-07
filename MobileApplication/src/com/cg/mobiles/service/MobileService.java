package com.cg.mobiles.service;

import java.util.List;

import com.cg.mobiles.dto.Mobile;
import com.cg.mobiles.exception.MobileException;

public interface MobileService {
	int addMobile(Mobile mobile) throws MobileException;
	List<Mobile> getAllMobiles() throws MobileException;
	Mobile getMobile(int mid) throws MobileException;
}