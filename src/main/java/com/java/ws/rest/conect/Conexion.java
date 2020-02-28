package com.java.ws.rest.conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    Connection con = null;
    public void conectar()
    {
    	if(con == null)
    	{
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3366/listpendients", "root", "root");
	            System.out.println("Conexión OK");
	        }
	        catch (SQLException e)
	        {
	            System.out.println("Error en la conexión: "+e+"\n"+con);
	        }
	        catch (ClassNotFoundException e)
	        {
	            System.out.println("Error al cargar el controlador: "+e+"\n"+con);
	        }
    	}    	
    }
    public void cerrar()
    {
    	try
    	{
    		if (con != null)
			{
			   con.close();
			}
    	}
    	catch(SQLException ex)
        {
    		System.out.println("Hubo un error al cerrar: "+ex);
        }
    }
    public static void main(String[] args)
    {
    }
}
