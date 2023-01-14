package com.convertic.horoscopo.ejerciciohoroscopo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHoroscopoRepository extends JpaRepository<TablaHoroscopo,Integer> {





}
