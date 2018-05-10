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
    @Column (nullable = true)
    private String ram;
    @Column (nullable = true)
    private String processor;
    @Column (nullable = true)
    private String battery;
    @Column (nullable = true)
    private String price;
    @Column (nullable = true)
    private String intMemory;
    @Column (nullable = true)
    private String screen;
    @Column (nullable = true)
    private String brand;

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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntMemory() {
        return intMemory;
    }

    public void setIntMemory(String intMemory) {
        this.intMemory = intMemory;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    @Column (nullable = true)
    private String rearCamera;
}
