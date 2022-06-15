package com.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurHasModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(targetEntity=Annee.class)
    private Annee professeurHasModuleCollectionAnnee;
    @ManyToOne(targetEntity=Courstdtp.class)
    private Courstdtp professeurHasModuleCollectionCoursTDTP;
    @ManyToOne(targetEntity=Section.class)
    private Section professeurHasModuleCollectionSection;
    @OneToMany( targetEntity=Examen.class, mappedBy="examen_prof" )
    private Collection<Examen> examen_prof;
    @ManyToOne(targetEntity=Professeur.class)
    private Professeur prof_module;
    @ManyToOne(targetEntity=Module.class)
    private Module professeurHasModuleCollection;
    @OneToMany(targetEntity= ProfesseurHMoHEt.class, mappedBy="professeurHasModule")
    private Collection<ProfesseurHMoHEt> professeurHasModule;
}