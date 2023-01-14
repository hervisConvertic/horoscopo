package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoroscopoServicio{
    private IHoroscopoRepository iHoroscopoRepository;

    public HoroscopoServicio(IHoroscopoRepository iHoroscopoRepository) {
        this.iHoroscopoRepository = iHoroscopoRepository;
    }

    public List<TablaHoroscopo> getHoroscopo(){
       return iHoroscopoRepository.findAll();
    }
    public void delete(TablaHoroscopo tablaHoroscopo){
        iHoroscopoRepository.delete(tablaHoroscopo);
    }
    public void save(TablaHoroscopo tablaHoroscopo){
        iHoroscopoRepository.save(tablaHoroscopo);
    }
    public void findById(Integer id){
        iHoroscopoRepository.findById(id);
    }
    public void udDate(TablaHoroscopo tablaHoroscopo,int id){
        Optional<TablaHoroscopo> horoscopo = iHoroscopoRepository.findById(id);
        TablaHoroscopo signo_no_existe = horoscopo.orElseThrow();
        signo_no_existe.setSigno(tablaHoroscopo.getSigno());
        signo_no_existe.setDia(tablaHoroscopo.getDia());
        signo_no_existe.setMes(tablaHoroscopo.getMes());
        iHoroscopoRepository.save(signo_no_existe);
    }



}
