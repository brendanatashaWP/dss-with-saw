package com.spk.saw.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "kandidat")
@EntityListeners(AuditingEntityListener.class)
public class KandidatModel {

    @Id
    private int id;

    @Column (nullable = true)
    private String namaKandidat;
}
