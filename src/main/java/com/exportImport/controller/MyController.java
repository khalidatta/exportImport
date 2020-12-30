package com.exportImport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exportImport.entities.Import;
import com.exportImport.exportImport.services.importService;
@RestController

public class MyController {
	@Autowired
	
	private importService ImportService;
	// exportsImportss
	@GetMapping("/Imports")
	
	public List<Import> getImports(){
		return this.ImportService.getImports();
		
	}
	@GetMapping ("/Imports/{importId}")
	public Import getImport(@PathVariable String importId)
	{
		return this.ImportService.getImport(Long.parseLong(importId));
	}
	
	@PostMapping("/Imports")
	public Import addImport(@RequestBody Import impor) {
		
	return this.ImportService.addImport(impor);
		
	}
}

