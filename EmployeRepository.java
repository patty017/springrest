package com.springrest.springrest.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.Entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Integer> {
    Employe findByName(String name);
}