package com.idat.TareaServicioI.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.TareaServicioI.model.Items;

@Repository
public class ItemsRepositoryImpl implements ItemsRepository {

	public static List<Items> lista = new ArrayList<>();
	
	static {
		lista.add(new Items(1,"monitor",2,1600.40));
	}
	
	@Override
	public void guardar(Items item) {
		lista.add(item);
	}

	@Override
	public void actualizar(Items item) {
		lista.remove(listarId(item.getIdItem()));
		
		lista.add(item);
	}

	@Override
	public void eliminar(Integer id) {
		lista.remove(listarId(id));
	}

	@Override
	public List<Items> listar() {
		return lista;
	}

	@Override
	public Items listarId(Integer id) {
		return lista.stream().filter(item -> item.getIdItem() == id).findFirst().orElse(null);
	}

}
