package com.services;
import com.entities.Salle;
import com.repositories.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Imp_SalleService implements SalleService{
    @Autowired
    private SalleRepository salleRepository;

    @Override
    public Salle save(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public List<Salle> fetchAll() {
        return salleRepository.findAll();
    }

    @Override
    public Salle fetchOne(Long id) {
        return salleRepository.findById(id).get();
    }

    @Override
    public Salle update(Salle salle, Long id) {
        salle.setId(id);
        return salleRepository.save(salle);
    }

    @Override
    public void delete(Long id) {
        salleRepository.deleteById(id);
}
}