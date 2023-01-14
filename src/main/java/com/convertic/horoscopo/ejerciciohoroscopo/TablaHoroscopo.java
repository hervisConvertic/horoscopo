package com.convertic.horoscopo.ejerciciohoroscopo;

import jakarta.persistence.*;


@Entity
public class TablaHoroscopo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dia")
    private int dia;
    private int mes;
    private String signo;


    public TablaHoroscopo() {
    }

    public TablaHoroscopo(int id, int dia, int mes, String signo) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.signo = signo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}
