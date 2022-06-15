package com.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapaciteEtudiant(long capaciteEtudiant) {
        this.capaciteEtudiant = capaciteEtudiant;
    }

    @Column(name = "name")
    private String name;
    @Column(name = "capaciteEtudiant")
    private long capaciteEtudiant;
    @Column(name = "NombreSurveillant")
    private long NombreSurveillant;
    @OneToMany( targetEntity=Soutenance.class, mappedBy="soutenance_idsoutenance" )
    private Collection<Soutenance> soutenance_idsoutenance;
    @OneToMany( targetEntity=Examen.class, mappedBy="examen_module" )
    private Collection<Examen> examen_module;
}