/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zorrillo.colonias.interfaces;

import com.zorrillo.colonias.modelo.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Zeidy Johana Estupiñan S.
 */
public interface InterfaceFragance extends MongoRepository<Fragance, String>{
    
}
