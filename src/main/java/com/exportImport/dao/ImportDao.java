package com.exportImport.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exportImport.entities.Import;

public interface ImportDao extends JpaRepository <Import, Long> {

}
