package com.spk.saw.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Entity
@Table(name = "bobot")
@EntityListeners(AuditingEntityListener.class)
public class BobotModel implements Serializable{

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBobotRam() {
        return bobotRam;
    }

    public void setBobotRam(Double bobotRam) {
        this.bobotRam = bobotRam;
    }

    public Double getBobotPro() {
        return bobotPro;
    }

    public void setBobotPro(Double bobotPro) {
        this.bobotPro = bobotPro;
    }

    public Double getBobotInternalMemory() {
        return bobotInternalMemory;
    }

    public void setBobotInternalMemory(Double bobotInternalMemory) {
        this.bobotInternalMemory = bobotInternalMemory;
    }

    public Double getBobotScreen() {
        return bobotScreen;
    }

    public void setBobotScreen(Double bobotScreen) {
        this.bobotScreen = bobotScreen;
    }

    public Double getBobotPrice() {
        return bobotPrice;
    }

    public void setBobotPrice(Double bobotPrice) {
        this.bobotPrice = bobotPrice;
    }

    public Double getBobotBattery() {
        return bobotBattery;
    }

    public void setBobotBattery(Double bobotBattery) {
        this.bobotBattery = bobotBattery;
    }

    public Double getBobotBrand() {
        return bobotBrand;
    }

    public void setBobotBrand(Double bobotBrand) {
        this.bobotBrand = bobotBrand;
    }

    public Double getBobotRearCamera() {
        return bobotRearCamera;
    }

    public void setBobotRearCamera(Double bobotRearCamera) {
        this.bobotRearCamera = bobotRearCamera;
    }

    @Column (nullable = false)
    private Double bobotRam, bobotPro, bobotInternalMemory, bobotScreen, bobotPrice, bobotBattery, bobotBrand, bobotRearCamera;

}
