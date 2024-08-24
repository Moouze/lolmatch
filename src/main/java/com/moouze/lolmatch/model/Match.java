package com.moouze.lolmatch.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "champion1_id")
    private Champions champion1;

    @ManyToOne
    @JoinColumn(name = "champion2_id")
    private Champions champion2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Champions getChampion1() {
        return champion1;
    }

    public void setChampion1(Champions champion1) {
        this.champion1 = champion1;
    }

    public Champions getChampion2() {
        return champion2;
    }

    public void setChampion2(Champions champion2) {
        this.champion2 = champion2;
    }
}
