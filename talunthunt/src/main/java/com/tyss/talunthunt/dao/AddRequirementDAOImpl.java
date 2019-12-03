package com.tyss.talunthunt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.talunthunt.dto.AddRequirements;
@Repository
public class AddRequirementDAOImpl implements AddRequirementInfoDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public AddRequirements addrequirement(AddRequirements reqinfo) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(reqinfo);
			transaction.commit();
			return reqinfo;
		} catch (Exception e) {
			manager.close();
			e.printStackTrace();
			return null;
		}
		
	
	}
	@Override
	public boolean updateRequirment(AddRequirements reqinfo) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		AddRequirements updateinfo = manager.find(AddRequirements.class,reqinfo.getClientId());
		if(updateinfo==null) {
			return false;	
		}
		transaction.begin();
		updateinfo.setClient(reqinfo.getClient());
		updateinfo.setTechnology(reqinfo.getTechnology());
		updateinfo.setYoe(reqinfo.getYoe());
		updateinfo.setLocation(reqinfo.getLocation());
		updateinfo.setNop(reqinfo.getNop());
		updateinfo.setOdate(reqinfo.getOdate());
		updateinfo.setCdate(reqinfo.getCdate());
		updateinfo.setRole(reqinfo.getRole());
		updateinfo.setRate(reqinfo.getRate());
		updateinfo.setContact(reqinfo.getContact());
		updateinfo.setJd(reqinfo.getJd());
		transaction.commit();
		return true;
	}
	@Override
	public List<AddRequirements> getAllRequirements() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "From AddRequirements";
		Query query = manager.createQuery(jpql);
		List<AddRequirements> req=(List<AddRequirements>) query.getResultList();
			return req;
		
	}

}
