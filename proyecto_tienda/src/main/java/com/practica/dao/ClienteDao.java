/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.dao;


import com.practica.domain.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ClienteDao extends JpaRepository <Cliente,Long> {
  
}
