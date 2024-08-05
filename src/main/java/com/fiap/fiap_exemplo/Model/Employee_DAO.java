/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fiap.fiap_exemplo.Model;

/**
 *
 * @author labsfiap
 */

/**
 * O profissional é identificado por um número de controle e, além dessa informação, ficam registrados o seu nome, endereço, nascimento e profissão.
 */
public class Employee_DAO {
    
    public String name;
    public String address;
    public String birthdate;
    public String ocupation;
    
    public Employee_DAO(String name, String address, String birthdate, String ocupation) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.ocupation = ocupation;
        
    }
    
}
