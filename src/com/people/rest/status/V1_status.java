package com.people.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.sql.*;
import com.people.rest.db.*;



//This is the root path of the rest service

@Path("v1/status")
public class V1_status {

private static final String api_version = "1.0.0";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p> Java Web Services , v1/status path</p>";
		
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion () {
		return "<p> Java Web Services version</p>" + api_version;
		
	}
	
	@Path("/database") //v1/status/database
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnDatabaseStatus() throws Exception {
		PreparedStatement query = null;
		String myString = null;
		String returnString = null;
		Connection conn = null;
		try {

//			Dbmanager db = new Dbmanager();
//			Connection conn = db.getConnection();

			Dbmanager db = new Dbmanager();
			conn = db.getConnection();
			System.out.println("conn=" + conn);
			
			//query = conn.prepareStatement("select now() numRec;");
			query = conn.prepareStatement("select count(*) numRec from persons;");
			System.out.println("query=" + query);
			
			ResultSet rs = query.executeQuery();
		while (rs.next()) {
			myString = rs.getString("numRec");
		}
		query.close();
		
		returnString = "<p> Database status</p> " +
				"<p> Number of records in the person table= " + myString + "</p> ";
//		"<p> Database date = " + myString + "</p> ";
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if (conn != null)conn.close();
		}
		return returnString;

	}
	
}
