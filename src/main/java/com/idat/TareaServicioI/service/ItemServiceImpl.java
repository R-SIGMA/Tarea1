package com.idat.TareaServicioI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.TareaServicioI.model.Items;
import com.idat.TareaServicioI.repository.ItemsRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	public ItemsRepository rep;
	
	@Override
	public void guardar(Items item) {
		rep.guardar(item);
	}

	@Override
	public void actualizar(Items item) {
		rep.actualizar(item);
	}

	@Override
	public void eliminar(Integer id) {
		rep.eliminar(id);
	}

	@Override
	public List<Items> listar() {
		return rep.listar();
	}

	@Override
	public Items listarId(Integer id) {
		return rep.listarId(id);
	}

}
