package com.spk.saw.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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

    public Integer getBobotRam() {
        return bobotRam;
    }

    public void setBobotRam(Integer bobotRam) {
        this.bobotRam = bobotRam;
    }

    public Integer getBobotPro() {
        return bobotPro;
    }

    public void setBobotPro(Integer bobotPro) {
        this.bobotPro = bobotPro;
    }

    public Integer getBobotInternalMemory() {
        return bobotInternalMemory;
    }

    public void setBobotInternalMemory(Integer bobotInternalMemory) {
        this.bobotInternalMemory = bobotInternalMemory;
    }

    public Integer getBobotScreen() {
        return bobotScreen;
    }

    public void setBobotScreen(Integer bobotScreen) {
        this.bobotScreen = bobotScreen;
    }

    public Integer getBobotPrice() {
        return bobotPrice;
    }

    public void setBobotPrice(Integer bobotPrice) {
        this.bobotPrice = bobotPrice;
    }

    public Integer getBobotBattery() {
        return bobotBattery;
    }

    public void setBobotBattery(Integer bobotBattery) {
        this.bobotBattery = bobotBattery;
    }

    public Integer getBobotBrand() {
        return bobotBrand;
    }

    public void setBobotBrand(Integer bobotBrand) {
        this.bobotBrand = bobotBrand;
    }

    public Integer getBobotRearCamera() {
        return bobotRearCamera;
    }

    public void setBobotRearCamera(Integer bobotRearCamera) {
        this.bobotRearCamera = bobotRearCamera;
    }

    @Column (nullable = false)
    private Integer bobotRam, bobotPro, bobotInternalMemory, bobotScreen, bobotPrice, bobotBattery, bobotBrand, bobotRearCamera;

}
