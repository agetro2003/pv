package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BDConexion extends Thread
{
	public void run() {
	//public static void (String [] args) 
	long inicio = System.currentTimeMillis();
	try 
	{
		Connection con = null;
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/data", "postgres", "postgres");
		Statement stmt = con.createStatement();
		stmt.executeQuery("select * from tabla");
		ResultSet rs = stmt.getResultSet();
	while (rs.next()) 
	{
		int sl = rs.getInt(1);
		String s = rs.getString(2);
		//System.out.println("-------------------------------");
		//System.out.println(sl+"\t| "+s);
	}
	
		System.out.println("Conexion exitosa");
		long fin = System.currentTimeMillis();
		long tiempoEjecucion = fin - inicio;
		System.out.println(tiempoEjecucion);
		System.out.println ("inicio "+inicio);
		System.out.println("fin "+fin);
		stmt.close();
	}
	catch (Exception e)
	{
		//e.printStackTrace();
		//System.out.println(e);
	}
	/*long fin = System.currentTimeMillis();
	long tiempoEjecucion = fin - inicio;
	System.out.println(tiempoEjecucion);*/
	}
	
	
}

