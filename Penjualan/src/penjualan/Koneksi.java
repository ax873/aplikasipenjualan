/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author resa
 */
import java.sql.DriverManager;
import java.sql.Connection;

public class Koneksi
{
	private static Connection koneksi;
	
	public static Connection getKoneksi()
	{
		if(koneksi == null)
		{
			try
			{
				String url = "jdbc:mysql://localhost/ims";
				String username = "root";
				String password = "root";
				
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				koneksi = DriverManager.getConnection(url,username,password);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		return koneksi;
	}
}
