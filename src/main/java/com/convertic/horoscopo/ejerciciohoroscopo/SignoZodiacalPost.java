package com.convertic.horoscopo.ejerciciohoroscopo;

import java.time.LocalDate;

public class SignoZodiacalPost {
    private String date;
    private int dia;
    private int mes;

    public SignoZodiacalPost(String date, int dia, int mes) {
        this.date = date;
        this.dia = dia;
        this.mes = mes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getSignoPost(){
        dia= LocalDate.parse(date).getDayOfMonth();
        mes=LocalDate.parse(date).getMonthValue();


        if (mes == 3 && dia >= 21||mes==4 && dia<=20) {
            return "ARIES";
        }
        if (mes == 4 && dia >= 21||mes==5 && dia<=20) {
            return "TAURO";
        }
        if (mes == 5 && dia >= 21||mes==6 && dia<=20) {
            return "GEMINIS";
        }
        if (mes == 6 && dia >= 21||mes==7 && dia<=20) {
            return "CANCER";
        }
        if (mes == 7 && dia >= 21||mes==8 && dia<=20) {
            return "LEO";
        }
        if (mes == 8 && dia >= 21||mes==9 && dia<=20) {
            return "VIRGO";
        }
        if (mes == 9 && dia >= 21||mes==10 && dia<=20) {
            return "LIBRA";
        }
        if (mes == 10 && dia >= 21||mes==11 && dia<=20) {
            return "ESCORPION";
        }
        if (mes == 11 && dia >= 21||mes==12 && dia<=20) {
            return "SAGITARIO";
        }
        if (mes == 12 && dia >= 21||mes==1 && dia<=20) {
            return "CAPRICORNIO";
        }
        if (mes == 1 && dia >= 21||mes==2 && dia<=20) {
            return "ACUARIO";
        }
        if (mes == 2 && dia >= 21||mes==3 && dia<=20) {
            return "ACUARIO";
        }

        return "Ingrese una fecha correcta";
    }
}
