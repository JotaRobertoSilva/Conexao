/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetomodelo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author geoinformacao
 */
public class Conexao {
    
	public static void main(String[] args) {		
		testarConexaoBancoDados();		
	}
	
	
	/*
	 * Este m�todo apenas testar� a conex�o com o Banco de Dados 
	 * 
	 * */
	public static void testarConexaoBancoDados() {
		//Conex�o URL - Conter� a localiza��o do Servidor e o nome do Banco de dados
		String conexaoURL = "jdbc:sqlserver://CAS419429C13652\\CITADEL:60241; databaseName=teste";
				
		// O JAVA tentar� fazer a conex�o, por isso no bloco try-catch
		try {
			// Criar uma inst�ncia do driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			Connection conn = DriverManager.getConnection(conexaoURL, "projetointegrador", "!!!97101311" ); //"SENACEDU\\geoinformacao", "2014geoinformacao");
			
			System.out.print("Conexao com o banco realizada com sucesso!");			
			
		} catch (SQLException sqlError) {
			System.out.println("======= Falha ao conectar no banco ");
			System.out.println("Mensagem de Erro " + sqlError.getMessage());
			System.out.println("Codigo do Erro " + sqlError.getErrorCode());		
		} catch (Exception e) {
			System.out.println("Nao foi possivel conectar " + e.getMessage());
		}		
	}
	
	
	/*
	 * Este m�todo retornar� a conex�o realizada
	 * 
	 * */
	public static Connection getConexaoBancoDados() {		
		Connection conn = null;		
		//Conex�o URL - Conter� a localiza��o do Servidor e o nome do Banco de dados
		String conexaoURL = "jdbc:sqlserver://localhost:60241; databaseName=msdb";
				
		// O JAVA tentar� fazer a conex�o, por isso no bloco try-catch
		try {
			// Criar uma inst�ncia do driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			conn = DriverManager.getConnection(conexaoURL, "triDojoOneck", "tridata");
			
			System.out.print("Conexao com o banco realizada com sucesso!");			
			
		} catch (SQLException sqlError) {
			System.out.println("======= Falha ao conectar no banco ");
			System.out.println("Mensagem de Erro " + sqlError.getMessage());
			System.out.println("C�digo do Erro " + sqlError.getErrorCode());		
		} catch (Exception e) {
			System.out.println("Nao foi possivel conectar " + e.getMessage());
		}		
		
		return conn;
	}	
			
    
    
}
