package com.idat.TareaServicioI.model;

import java.io.Serializable;

public class Items implements Serializable{
	
	private static final long serialVersionUID = -1358982477138670143L;

	private Integer idItem;
	private String item;
	private Integer cantidad;
	private Double total;
	
	public Items() {}

	public Items(Integer idItem, String item, Integer cantidad, Double total) {
		this.idItem = idItem;
		this.item = item;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
