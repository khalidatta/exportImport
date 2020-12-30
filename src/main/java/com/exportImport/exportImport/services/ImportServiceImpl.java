package com.exportImport.exportImport.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exportImport.dao.ImportDao;
import com.exportImport.entities.Import;
@Service

public class ImportServiceImpl implements importService {
	@Autowired
	private ImportDao importDao;
	
//	List<Import> list;
	
	public ImportServiceImpl() {
		
		//list= new ArrayList <>();
		//list.add(new Import(1,"IPAE","4762","01-09-2020","0201,1000","CHILLED BEEF MEAT VEAL CARCASS   AS PER INV",682,
		//  "Saudi Arabia",3340420,"M/S TAZIJ MEATS & FOOD","3.5-KM RAIWIND MANGA ROAD RAIWIND MANGA ROAD LAHORE",
		//	"OWAYID S AL SHAHRANI TRD","KSA","1450,0000","1450,0000","1450,00","KG","4,2500",840,"3890,00",840,
		//	"1029137,50","6162,50",496,"DHANYYAL"));
		
		
	}

	@Override
	public List<Import> getImports() {
		
	
		return importDao.findAll();
		
	}

	@Override
	public Import getImport(long importId) {
		
	//	Import c = null;
	//	for(Import Import:list)
	//	{
	//		if(Import.getId()==importId)
	//		{
				
	//			c=Import;
	//			break;
	//		}
	//	}
		
		
		return importDao.getOne(importId);
		
	
	}

	@Override
	public Import addImport(Import impor) {
	//	list.add(impor);
		importDao.save(impor);
		return impor;
	}

}
