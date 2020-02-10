package com.bibavix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bibavix.model.Cliente;
import com.bibavix.model.Fretalla;
import com.bibavix.model.Zapato;

public class FretallaDao {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate _template) {
		this.template = _template;
	}
	
	public int save(Fretalla fretalla) {
		String sql = "INSERT INTO fretalla (id_zapato,id_cliente) VALUES("+fretalla.getZapato()+","+fretalla.getCliente()+")"; //MALA PRÁCTICA
		return template.update(sql);
	}
	
	public List<Fretalla> listAllFretallas(){
		String sql = "SELECT * FROM fretalla";
		return template.query(sql, new RowMapper<Fretalla>() {

			@Override
			public Fretalla mapRow(ResultSet rs, int rowNum) throws SQLException {
				Fretalla fretalla = new Fretalla();
				Zapato zapato = new Zapato();
				zapato.setId(rs.getLong(2));
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong(3));
				fretalla.setId(rs.getLong(1));
				fretalla.setZapato(zapato.getId());
				fretalla.setCliente(cliente.getId());
				return fretalla;
			}
			
		});
	}
	
	
}
