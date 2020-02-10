package com.bibavix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bibavix.model.Zapato;

public class ZapatoDao {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate _template) {
		this.template = _template;
	}
	
	public int save(Zapato zapato) {
		String sql = "INSERT INTO zapato(marca,color,tipo,talla) VALUES("+zapato.getMarca()+", "+zapato.getColor()+","
				+ ""+zapato.getTipo()+","+zapato.getTalla()+")"; //MALA PRÁCTICA
		return template.update(sql);
	}
	
	public Zapato searchBy(long id)
	{
		String sql = "SELECT * FROM zapato WHERE id_zapato = ?";
		return template.queryForObject(sql, new Object[] {id}, new RowMapper<Zapato>() {

			@Override
			public Zapato mapRow(ResultSet rs, int rowNum) throws SQLException {
				Zapato zapato = new Zapato();
				zapato.setId(rs.getLong(1));
				zapato.setMarca(rs.getString(2));
				zapato.setColor(rs.getString(3));
				zapato.setTipo(rs.getString(4));
				zapato.setTalla(rs.getInt(5));
				return zapato;
			}
			
		});
	}
	
	public List<Zapato> listAllShoes(){
		String sql = "SELECT *  FROM zapato";
		return template.query(sql, new RowMapper<Zapato>() {
			@Override
			public Zapato mapRow(ResultSet rs, int rowNum) throws SQLException {
				Zapato zapato = new Zapato();
				zapato.setId(rs.getLong(1));
				zapato.setMarca(rs.getString(2));
				zapato.setColor(rs.getString(3));
				zapato.setTipo(rs.getString(4));
				zapato.setTalla(rs.getInt(5));
				return zapato;
			}
			
		});
	}
	
	
	
}
