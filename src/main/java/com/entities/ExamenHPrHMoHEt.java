package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
// ExamenHasProfesseurHasModuleHasEtudiant == ExamenHPrHMoHEt
public class ExamenHPrHMoHEt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(targetEntity= ProfesseurHMoHEt.class)
    private ProfesseurHMoHEt examens;
    @ManyToOne(targetEntity=Examen.class)
    private Examen examenHasProfesseur;
}
