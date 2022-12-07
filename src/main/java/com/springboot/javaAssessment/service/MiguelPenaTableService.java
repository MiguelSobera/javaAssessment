package com.springboot.javaAssessment.service;

import com.springboot.javaAssessment.model.MiguelPenaTable;
import com.springboot.javaAssessment.repository.MiguelPenaTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiguelPenaTableService {

    @Autowired
    MiguelPenaTableRepository miguelPenaTableRepository;

    public List<MiguelPenaTable> findAllMiguelPenaTable() {
        return miguelPenaTableRepository.findAll();
    }

    public MiguelPenaTable addMiguelPenaTable(MiguelPenaTable miguelPenaTable) {
        return miguelPenaTableRepository.save(miguelPenaTable);
    }
}
