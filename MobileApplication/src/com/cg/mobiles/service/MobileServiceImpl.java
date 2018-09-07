package com.cg.mobiles.service;

import java.util.List;

import com.cg.mobiles.dao.MobileDao;
import com.cg.mobiles.dao.MobileDaoImpl;
import com.cg.mobiles.dto.Mobile;
import com.cg.mobiles.exception.MobileException;

public class MobileServiceImpl implements MobileService {
	MobileDao mdao = new MobileDaoImpl();
	@Override
	public int addMobile(Mobile mobile) throws MobileException {
		return mdao.insertMobile(mobile);
	}
	@Override
	public List<Mobile> getAllMobiles() throws MobileException {
		return mdao.getAllMobiles();
	}
	@Override
	public Mobile getMobile(int mid) throws MobileException {
		return mdao.fetchMobile(mid);
	}
}
