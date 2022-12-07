package com.springboot.javaAssessment.controller;

import com.springboot.javaAssessment.model.MiguelPenaTable;
import com.springboot.javaAssessment.service.MiguelPenaTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class MiguelPenaTableController {

    @Autowired
    MiguelPenaTableService miguelPenaTableService;

    @GetMapping("/show")
    public List<MiguelPenaTable> showAllMiguelPenaTable() {
        return miguelPenaTableService.findAllMiguelPenaTable();
    }

    @PostMapping("/create")
    public MiguelPenaTable createMiguelPenaTable(@RequestBody MiguelPenaTable miguelPenaTable){
        return miguelPenaTableService.addMiguelPenaTable(miguelPenaTable);
    }


}
