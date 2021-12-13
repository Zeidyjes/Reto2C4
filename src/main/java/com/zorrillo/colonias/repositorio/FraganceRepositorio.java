/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zorrillo.colonias.repositorio;

import com.zorrillo.colonias.interfaces.InterfaceFragance;
import com.zorrillo.colonias.modelo.Fragance;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ydiez
 */
@Repository
public class FraganceRepositorio {
    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getFragance(String reference) {
        return repository.findById(reference);
    }
    public Fragance create(Fragance fragance) {
        return repository.save(fragance);
    }

    public void update(Fragance fragance) {
        repository.save(fragance);
    }
    
    public void delete(Fragance fragance) {
        repository.delete(fragance);
    }


}
