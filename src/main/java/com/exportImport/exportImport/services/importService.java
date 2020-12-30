package com.exportImport.exportImport.services;

import java.util.List;
import com.exportImport.entities.Import;

public interface importService {

	public List<Import> getImports();
	
	public Import getImport(long importId);
	
	public Import addImport(Import impor);
}

