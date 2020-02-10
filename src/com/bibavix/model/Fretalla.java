package com.bibavix.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Fretalla {

	private long id;
	private long zapato;
	private long cliente;
	
	public Fretalla() {
		
	}

	public Fretalla(long id, long zapato, long cliente) {
		super();
		this.id = id;
		this.zapato = zapato;
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getZapato() {
		return zapato;
	}

	public void setZapato(long zapato) {
		this.zapato = zapato;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}
	
	public static Fretalla getFrecuencia(List<Fretalla> listFretalla) {
		Map<Fretalla, Long> map = new HashMap<>();
		for (Fretalla fretalla : listFretalla) {
			Long val = map.get(fretalla);
			map.put(fretalla, val == null ? 1 : val + 1);
		}
		
		Entry<Fretalla, Long> max = null;
		for(Entry<Fretalla, Long> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue()) {
				max = e;
			}
		}	
		
		return max.getKey();
	}


	
}
