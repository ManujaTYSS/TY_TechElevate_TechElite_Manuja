package com.tyss.talunthunt.dao;

import java.util.List;

import com.tyss.talunthunt.dto.AddRequirements;

public interface AddRequirementInfoDAO {
	public AddRequirements addrequirement(AddRequirements reqinfo);

	public boolean updateRequirment(AddRequirements reqinfo);
	
	public List<AddRequirements> getAllRequirements();
}
