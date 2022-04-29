package com.idat.TareaServicioI.service;

import java.util.List;

import com.idat.TareaServicioI.model.Items;

public interface ItemService {

	public void guardar (Items item);
	public void actualizar (Items item);
	public void eliminar (Integer id);
	public List<Items> listar();
	public Items listarId(Integer id);
	
}
