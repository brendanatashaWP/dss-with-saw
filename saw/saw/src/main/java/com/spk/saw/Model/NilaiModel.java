package com.spk.saw.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;

@Component
@Entity
@Table(name = "hasil")
@EntityListeners({AuditingEntityListener.class})
public class NilaiModel {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    int id;
    public Double getNilaiRam() {
        return nilaiRam;
    }

    public void setNilaiRam(Double nilaiRam) {
        this.nilaiRam = nilaiRam;
    }

    public Double getNilaiPro() {
        return nilaiPro;
    }

    public void setNilaiPro(Double nilaiPro) {
        this.nilaiPro = nilaiPro;
    }

    public Double getNilaiBattery() {
        return nilaiBattery;
    }

    public void setNilaiBattery(Double nilaiBattery) {
        this.nilaiBattery = nilaiBattery;
    }

    public Double getNilaiPrice() {
        return nilaiPrice;
    }

    public void setNilaiPrice(Double nilaiPrice) {
        this.nilaiPrice = nilaiPrice;
    }

    public Double getNilaiIntMemory() {
        return nilaiIntMemory;
    }

    public void setNilaiIntMemory(Double nilaiIntMemory) {
        this.nilaiIntMemory = nilaiIntMemory;
    }

    public Double getNilaiScreen() {
        return nilaiScreen;
    }

    public void setNilaiScreen(Double nilaiScreen) {
        this.nilaiScreen = nilaiScreen;
    }

    public Double getNilaiBrand() {
        return nilaiBrand;
    }

    public void setNilaiBrand(Double nilaiBrand) {
        this.nilaiBrand = nilaiBrand;
    }

    public Double getNilaiRearCamera() {
        return nilaiRearCamera;
    }

    public void setNilaiRearCamera(Double nilaiRearCamera) {
        this.nilaiRearCamera = nilaiRearCamera;
    }
    @Column (nullable = true)
    Double nilaiRam;
    @Column (nullable = true)
    Double nilaiPro;
    @Column (nullable = true)
    Double nilaiBattery;
    @Column (nullable = true)
    Double nilaiPrice;
    @Column (nullable = true)
    Double nilaiIntMemory;
    @Column (nullable = true)
    Double nilaiScreen;
    @Column (nullable = true)
    Double nilaiBrand;
    @Column (nullable = true)
    Double nilaiRearCamera;
}
