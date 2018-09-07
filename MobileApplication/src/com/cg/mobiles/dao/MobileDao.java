package com.cg.mobiles.dao;

import java.util.List;

import com.cg.mobiles.dto.Mobile;
import com.cg.mobiles.exception.MobileException;

public interface MobileDao {
	int insertMobile(Mobile mobile) throws MobileException;
	List<Mobile> getAllMobiles() throws MobileException;
	Mobile fetchMobile(int mid) throws MobileException;
}