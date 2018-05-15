package com.spk.saw.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "hasilsaw")
@EntityListeners(AuditingEntityListener.class)
public class SawModel {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKandidat() {
        return namaKandidat;
    }

    public void setNamaKandidat(String namaKandidat) {
        this.namaKandidat = namaKandidat;
    }

    public Double getHasilSaw() {
        return hasilSaw;
    }

    public void setHasilSaw(Double hasilSaw) {
        this.hasilSaw = hasilSaw;
    }

    @Column(nullable = true)
    private String namaKandidat;
    @Column
    private Double hasilSaw;
}
