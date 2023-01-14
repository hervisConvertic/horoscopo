package com.convertic.horoscopo.ejerciciohoroscopo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HoroscopoController {
    private HoroscopoServicio horoscopoServicio;

    public HoroscopoController(HoroscopoServicio horoscopoServicio) {
        this.horoscopoServicio = horoscopoServicio;
    }

    @GetMapping("/horoscopo")
    public List<TablaHoroscopo> getHoroscopo() {
        return horoscopoServicio.getHoroscopo();
    }

    @PostMapping("/crear")
    public ResponseEntity<Boolean> getAgregar(@RequestBody TablaHoroscopo tablaHoroscopo) {

        try {
            horoscopoServicio.save(tablaHoroscopo);
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/actualizar/{id}")
    public void getActualizar(@RequestBody TablaHoroscopo tablaHoroscopo, @PathVariable(name = "id") int id) {
        horoscopoServicio.udDate(tablaHoroscopo,id);
    }

    //pendiente por crear
    //@GetMapping("/traer/{dia}/{mes}")


}
