package br.sceweb.modelo;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {
	public int adiciona(Empresa empresa){
		try(Connection conn = new FabricaDeConexoes().getConnection()){
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return 2;
	}
}
