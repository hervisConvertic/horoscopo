package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SignoZodical {

    private Simbolo simbolo;

    public SignoZodical(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public String getSigno(int dia, int mes) {
        String signo;
        signo = "";
        if (mes == 3 && dia >= 21 || mes == 4 && dia <= 20) {

            signo = "Aries";

        }
        if (mes == 4 && dia >= 21 || mes == 5 && dia <= 20) {
            signo = "TAURO";
        }
        if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            signo = "GIMINIS";
        }
        if (mes == 6 && dia >= 21 || mes == 7 && dia <= 20) {
            signo = "CANCER";
        }
        if (mes == 7 && dia >= 21 || mes == 8 && dia <= 20) {
            signo = "LEO";
        }
        if (mes == 8 && dia >= 21 || mes == 9 && dia <= 20) {
            signo = "VIRGO";
        }
        if (mes == 9 && dia >= 21 || mes == 10 && dia <= 20) {
            signo = "LIBRA";
        }
        if (mes == 10 && dia >= 21 || mes == 11 && dia <= 20) {
            signo = "ESCORPION";
        }
        if (mes == 11 && dia >= 21 || mes == 12 && dia <= 20) {
            signo = "SAGITARIO";
        }
        if (mes == 12 && dia >= 21 || mes == 1 && dia <= 20) {
            signo = "CAPRICORNIO";
        }
        if (mes == 1 && dia >= 21 || mes == 2 && dia <= 20) {
            signo = "ACUARIO";
        }
        if (mes == 2 && dia >= 21 || mes == 3 && dia <= 20) {
            signo = "ACUARIO";
        }

        signo = signo.concat(simbolo.getDefinirSimbolo(signo));
        return signo;
    }

}
