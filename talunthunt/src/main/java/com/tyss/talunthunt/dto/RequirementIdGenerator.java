package com.tyss.talunthunt.dto;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import com.tyss.talunthunt.dto.AddRequirements;
@Component
public class RequirementIdGenerator implements IdentifierGenerator {
	static AddRequirements addreqinfo;


	private final String DEFAULT_SEQUENCE_NAME = "hibernate_sequence";
	Scanner sc = new Scanner(System.in);
	Serializable result = null;
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public boolean generate(AddRequirements reqinfo) {
		addreqinfo = reqinfo;
		return true;

	}


	public  Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {


		try {
			connection = session.connection();
			statement = connection.createStatement();
			try {
				int next_val=0;
				statement.executeUpdate("UPDATE " + DEFAULT_SEQUENCE_NAME + " SET next_val=next_val+1");
				resultSet = statement.executeQuery("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
			} catch (Exception e) {

				System.out.println("In catch, cause : Table is not available.");
				int next_val=0;
				statement.execute("CREATE table " + DEFAULT_SEQUENCE_NAME + " (next_val INT NOT NULL)");
				statement.executeUpdate("INSERT INTO " + DEFAULT_SEQUENCE_NAME + " VALUES(0)");
				statement.executeUpdate("UPDATE " + DEFAULT_SEQUENCE_NAME + " SET next_val=(next_val)");
				resultSet = statement.executeQuery("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
			}
			if (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				String client = addreqinfo.getClient().replaceAll("\\s+","") ;
				String technology = addreqinfo.getTechnology().replaceAll("\\s+","") ;
//				String location=resultSet.getString(5);
				String prefix = "TY_"+ client +"_"+ technology +"_";
				int nextValue = resultSet.getInt(1);
				String suffix = String.format("%01d", nextValue+1);
				result = prefix.concat(suffix);
				System.out.println("Custom generated sequence is : " + result);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;


	}

}



