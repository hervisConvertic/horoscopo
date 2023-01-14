package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api")
public class Horoscopo {

    private SignoZodical signoZodical;


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

        return signoZodical.getSigno(dia,mes);

    }
}
