package com.springrest.springrest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.Entity.Employe;
import com.springrest.springrest.Service.EmployeService;

import java.util.List;

@RestController
public class EmployeController {
	
    @Autowired
    private EmployeService service;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody  Employe emp) {
        return service.saveEmploye(emp);
    }

    @PostMapping("/addEmploye")
    public List<Employe> addEmployes(@RequestBody List<Employe>  emp ) {
        return service.saveEmploye(emp);
    }

    @GetMapping("/Employes")
    public List<Employe> findAllEmployes() {
        return service.getEmployes();
    }

    @GetMapping("/EmployeById/{id}")
    public Employe findEmployeById(@PathVariable int id) {
        return service.getEmployeById(id);
    }

    @GetMapping("/Employe/{name}")
    public Employe findProductByName(@PathVariable String name) {
        return service.getEmployeByName(name);
    }

    @PutMapping("/update")
    public Employe updateEmploye(@RequestBody Employe Employe) {
        return service.updateEmploye(Employe);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmploye(@PathVariable int id) {
        return service.deleteEmploye(id);
    }
}
