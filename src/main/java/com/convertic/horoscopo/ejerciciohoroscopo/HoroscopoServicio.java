package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoroscopoServicio{
    private IHoroscopoRepository iHoroscopoRepository;

    public HoroscopoServicio(IHoroscopoRepository iHoroscopoRepository) {
        this.iHoroscopoRepository = iHoroscopoRepository;
    }

    public List<TablaHoroscopo> getHoroscopo(){
       return iHoroscopoRepository.findAll();
    }

}
