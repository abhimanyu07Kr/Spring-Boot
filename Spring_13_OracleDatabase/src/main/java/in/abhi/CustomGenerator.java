package in.abhi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator{
	
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		String prefix="stu";
		String suffix="";
		try {
		
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","scott","tiger");
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery("select order_in_seq.nextval from dual");
			
			if(set.next())
			{
				int int1 = set.getInt(1);
				
				System.out.println(int1+" int1 val");
				suffix=String.valueOf(int1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
