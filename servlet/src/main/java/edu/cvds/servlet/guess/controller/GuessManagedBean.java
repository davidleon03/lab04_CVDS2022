/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cvds.servlet.guess.controller;

import java.util.concurrent.ThreadLocalRandom;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "guessBean")
@SessionScoped
//@ApplicationScoped
public class GuessManagedBean {
    
    private int numero;
    private int intentos;
    private int premio = 100000;
    private String estado = "";
    private int numeroAdivinar = ThreadLocalRandom.current().nextInt(1, 100 + 1);//El numero esta entre [1-100]

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    
    public void comparar(){
        if (numero == numeroAdivinar && premio > 0){
            estado = "Acertó";
            premio += 100000;
        }
        else{
            intentos -= 1;
            premio -= 10000;
            if (premio < 0){reiniciar();}
            estado = "Falló";
        }
    }
    
    public void reiniciar(){
        numeroAdivinar = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        numero = 0;
        premio = 100000;
        estado = "";
    }
}