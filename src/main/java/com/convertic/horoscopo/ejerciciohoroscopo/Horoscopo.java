package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api")
public class Horoscopo {

    //metodo post
    @PostMapping(value = "horoscopo")
    public String getSignoIngresado(@RequestBody SignoZodiacalPost signoZodiacalPost){
        String signoZodiaco;
        signoZodiaco=signoZodiacalPost.getSignoPost();
        return "Su signo del zodiaco es "+signoZodiaco;
    }
    //metodo get
    @GetMapping(value = "/horoscopo/{fecha}")
    public String getHoroscopo(@PathVariable(name = "fecha") String fecha) {

        int dia = LocalDate.parse(fecha).getDayOfMonth();
        int mes = LocalDate.parse(fecha).getMonthValue();

        SignoZodical signoZodical=new SignoZodical(dia,mes);

        return signoZodical.getSigno();

    }
}
