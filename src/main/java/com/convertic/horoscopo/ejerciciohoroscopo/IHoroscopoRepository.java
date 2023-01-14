package com.convertic.horoscopo.ejerciciohoroscopo;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHoroscopoRepository extends JpaRepository<TablaHoroscopo, Integer> {
    @Query("SELECT th FROM TablaHoroscopo th WHERE th.dia =:dia AND th.mes =:mes")
    public List<TablaHoroscopo> buscarSignoByDiaMes(Integer dia, Integer mes);
}
