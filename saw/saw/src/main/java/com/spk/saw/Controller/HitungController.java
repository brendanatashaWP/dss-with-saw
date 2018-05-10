package com.spk.saw.Controller;

import com.spk.saw.Interface.BobotInter;
import com.spk.saw.Interface.KandidatInter;
import com.spk.saw.Interface.NilaiInter;
import com.spk.saw.Model.BobotModel;
import com.spk.saw.Model.KandidatModel;
import com.spk.saw.Model.NilaiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityListeners;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HitungController {

    @Autowired
    KandidatInter kandidatInter;

    @Autowired
    BobotInter bobotInter;

    NilaiInter nilaiInter;


    //Translate nilai kandidat jadi bobot variabel
    @PutMapping("/translate")
    public NilaiModel[] translateNilai(@Valid @RequestBody NilaiModel[] nilaiModel) {
        KandidatModel kandidatModel = (KandidatModel) kandidatInter.findAll();
        for (int x = 0; x <= 5; x++) {
            switch (kandidatModel.getRam()) {
                case "8 GB" : nilaiModel[x].setNilaiRam((double) 1); break;
                case "6 GB" : nilaiModel[x].setNilaiRam(0.75); break;
                case "4 GB" : nilaiModel[x].setNilaiRam(0.50); break;
                case "3 GB" : nilaiModel[x].setNilaiRam(0.25); break;
                case "2 GB" : nilaiModel[x].setNilaiRam((double) 0); break;
            }
            switch (kandidatModel.getProcessor()) {
                case "Snapdragon" : nilaiModel[x].setNilaiPro((double) 1); break;
                case "Mediatek" : nilaiModel[x].setNilaiPro(0.50); break;
                case "Intel" : nilaiModel[x].setNilaiPro((double) 0); break;
            }
            switch (kandidatModel.getBattery()) {
                case "5001 - 6000" : nilaiModel[x].setNilaiBattery((double) 1); break;
                case "4001 - 5000" : nilaiModel[x].setNilaiBattery(0.70); break;
                case "3001 - 4000" : nilaiModel[x].setNilaiBattery(0.30); break;
                case "2000 - 3000" : nilaiModel[x].setNilaiBattery((double) 0); break;
            }
            switch (kandidatModel.getPrice()) {
                case "6jt - 7jt" : nilaiModel[x].setNilaiPrice((double) 1); break;
                case "4jt - 5jt" : nilaiModel[x].setNilaiPrice(0.75); break;
                case "3jt - 4jt" : nilaiModel[x].setNilaiPrice(0.50); break;
                case "2jt - 3jt" : nilaiModel[x].setNilaiPrice(0.25); break;
                case "1jt - 2jt" : nilaiModel[x].setNilaiPrice((double) 0); break;
            }
            switch (kandidatModel.getIntMemory()) {
                case "128 Gb" : nilaiModel[x].setNilaiIntMemory((double) 1); break;
                case "64 Gb" : nilaiModel[x].setNilaiIntMemory(0.70); break;
                case "32 Gb" : nilaiModel[x].setNilaiIntMemory(0.30); break;
                case "16 Gb" : nilaiModel[x].setNilaiIntMemory((double) 0); break;
            }
            switch (kandidatModel.getScreen()) {
                case "6,1 - 6,5" : nilaiModel[x].setNilaiScreen((double) 1); break;
                case "5,6 - 6" : nilaiModel[x].setNilaiScreen(0.70); break;
                case "5,1 - 5,5" : nilaiModel[x].setNilaiScreen(0.30); break;
                case "4,5 - 5" : nilaiModel[x].setNilaiScreen((double) 0); break;
            }
            switch (kandidatModel.getRearCamera()) {
                case "16" : nilaiModel[x].setNilaiRearCamera((double) 1); break;
                case "13" : nilaiModel[x].setNilaiRearCamera(0.75); break;
                case "12" : nilaiModel[x].setNilaiRearCamera(0.50); break;
                case "8" : nilaiModel[x].setNilaiRearCamera(0.25); break;
                case "5" : nilaiModel[x].setNilaiRearCamera((double) 0); break;
            }
            switch (kandidatModel.getBrand()) {
                case "Samsung" : nilaiModel[x].setNilaiBrand((double) 1); break;
                case "Oppo" : nilaiModel[x].setNilaiBrand(0.75); break;
                case "Vivo" : nilaiModel[x].setNilaiBrand(0.50); break;
                case "Xiaomi" : nilaiModel[x].setNilaiBrand(0.25); break;
                case "LG" : nilaiModel[x].setNilaiBrand((double) 0); break;
            }
        }
        return nilaiModel;
    }

    @GetMapping("/tampil")
    public List<NilaiModel> getAllNilai() {
        return nilaiInter.findAll();
    }
}
