package com.aglistech.springbootfirebase;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CRUDController {
	public CRUDService crudService;
	
	@PostMapping("/create")
	public String createCRUD(@RequestBody CRUD crud) throws InterruptedException, ExecutionException{
		return crudService.createCRUD(crud);
	}
	
	@GetMapping("/get")
	public CRUD getCRUD(@RequestParam String document_id) throws InterruptedException, ExecutionException{
		return crudService.getCRUD(document_id);
	}
	

	@PutMapping("/update")
	public String updateCRUD(@RequestBody CRUD crud) throws InterruptedException, ExecutionException{
		return crudService.updateCRUD(crud);
	}
	
	@DeleteMapping("/delete")
	public String deleteCRUD(@RequestBody CRUD crud) throws InterruptedException, ExecutionException{
		return crudService.deleteCRUD(crud);
	}
}
