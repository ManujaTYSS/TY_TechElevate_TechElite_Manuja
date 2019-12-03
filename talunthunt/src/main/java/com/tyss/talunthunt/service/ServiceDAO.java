package com.tyss.talunthunt.service;

import java.util.List;

import com.tyss.talunthunt.dto.AddRequirements;

public interface ServiceDAO {
	public AddRequirements addrequirement(AddRequirements reqinfo);
	public boolean updateRequirment(AddRequirements reqinfo);
	public List<AddRequirements> getAllRequirements();
}
