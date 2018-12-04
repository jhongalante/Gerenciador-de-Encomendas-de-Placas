/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonata
 */
public class Cliente {
    
    private String nome;
    private String telefone;
    
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Cliente(){
        this.nome = "";
        this.telefone = "";
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
    
    
    
    
}
