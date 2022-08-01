package com.springrest.springrest.Service;

import com.springrest.springrest.Entity.*;
import com.springrest.springrest.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository repository;

    public Employe saveEmploye(Employe Employe) {
        return repository.save(Employe);
    }

    public List<Employe> saveEmploye(List<Employe> Employes) {
        return repository.saveAll(Employes);
    }

    public List<Employe> getEmployes() {
        return repository.findAll();
    }

    public Employe getEmployeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employe getEmployeByName(String name) {
        return repository.findByName(name);
    }

    public String deleteEmploye(int id) {
        repository.deleteById(id);
        return "Employe removed !! " + id;
    }

    public Employe updateEmploye(Employe Employe) {
    	Employe existingEmploye = repository.findById(Employe.getId()).orElse(null);
        existingEmploye.setName(Employe.getName());
        existingEmploye.setContact(Employe.getContact());
        existingEmploye.setSal(Employe.getSal());
        return repository.save(existingEmploye);
    }


}