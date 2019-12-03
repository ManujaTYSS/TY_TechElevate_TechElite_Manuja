package com.tyss.talunthunt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.talunthunt.dao.AddRequirementInfoDAO;
import com.tyss.talunthunt.dto.AddRequirements;
@Service
public class ServiceDAOImpl implements ServiceDAO{
	@Autowired
	 private AddRequirementInfoDAO dao;
	@Override
	public AddRequirements addrequirement(AddRequirements reqinfo) {
		
		return dao.addrequirement(reqinfo);
	}
	@Override
	public boolean updateRequirment(AddRequirements reqinfo) {
		
		return dao.updateRequirment(reqinfo);
	}
	@Override
	public List<AddRequirements> getAllRequirements() {
		
		return dao.getAllRequirements();
	}
	
}
