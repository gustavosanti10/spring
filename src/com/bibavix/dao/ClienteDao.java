package com.bibavix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.bibavix.model.Cliente;

public class ClienteDao {
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate _template) {
		this.template = _template;
	}
	
	public int save(Cliente cliente) {
		String sql = "INSERT INTO cliente(nombre,apellido,edad) VALUES("+cliente.getNombre()+","+cliente.getApellido()+","
				+ ""+cliente.getEdad()+")"; //MALA PRÁCTICA
		return template.update(sql);
	}
	
	public Cliente searchBy(long id) {
		String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
		return template.queryForObject(sql, new Object[] {id}, new RowMapper<Cliente>() {
			@Override
			public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				return cliente;
			}		
		});
	
	}
	
	public List<Cliente> listAllClients(){
		String sql ="SELECT * FROM cliente";
		return template.query(sql, new RowMapper<Cliente>() {

			@Override
			public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				return cliente;
			}
			
		});
	}
	
}
