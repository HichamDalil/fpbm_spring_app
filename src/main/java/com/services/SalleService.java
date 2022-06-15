package com.services;

import com.entities.Salle;

import java.util.List;

public interface SalleService {
    Salle save(Salle salle);

    List<Salle> fetchAll();

    Salle fetchOne(Long id);

    Salle update(Salle salle, Long id);

    void delete(Long id);
}