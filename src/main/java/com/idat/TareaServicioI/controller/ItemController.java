package com.idat.TareaServicioI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.TareaServicioI.model.Items;
import com.idat.TareaServicioI.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService serv;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Items>> listar(){
		return new ResponseEntity<>(serv.listar(), HttpStatus.OK);
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Items> listarId(@PathVariable Integer id){
		Items i = serv.listarId(id);
		
		if(i != null)
			return new ResponseEntity<Items>(i, HttpStatus.OK);
		
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Items item){
		serv.guardar(item);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PatchMapping("/actualizar")
	public ResponseEntity<Void> actualizar(@RequestBody Items item){
		Items i = serv.listarId(item.getIdItem());
		
		if(i != null) {
			serv.actualizar(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Items i = serv.listarId(id);
		
		if(i != null) {
			serv.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
