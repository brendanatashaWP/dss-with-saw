package com.spk.saw.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.spk.saw.Exception.ResourceNotFoundException2;
import com.spk.saw.Interface.KandidatInter;
import com.spk.saw.Interface.NilaiInter;
import com.spk.saw.Model.KandidatModel;
import com.spk.saw.Model.NilaiModel;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class KandidatController {

    @Autowired
    KandidatInter kandidatInter;
    @Autowired
    NilaiInter nilaiInter;
    @Autowired
    NilaiModel nilaiModel;

    //Post kandidat
    @PostMapping("/step2")
    public KandidatModel isiKandidat(@Valid @RequestBody KandidatModel kandidat) {
        return kandidatInter.save(kandidat);
    }

    //Get all
    @GetMapping("/step2")
    public List<KandidatModel> getAllKandidat() {
        return kandidatInter.findAll();
    }

    //Get 1 id
    @GetMapping("/step2/{id}")
    public KandidatModel getKandidatById(@PathVariable(value = "id") Integer id) {
        return kandidatInter.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException2("KandidatModel", "id", id));
    }

    //Update kandidat
    @PutMapping("/step2/{id}")
    public KandidatModel updateKandidat(@PathVariable(value = "id") Integer id,
                                        @Valid @RequestBody KandidatModel kandidat) {
//        KandidatModel updateKandidat = new KandidatModel();
//        for (int x = 0; x <= 5; x++) {
            KandidatModel kandidatModel = kandidatInter.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException2("KandidatModel", "id", id));
            kandidatModel.setNamaKandidat(kandidat.getNamaKandidat());
            kandidatModel.setBattery(kandidat.getBattery());
            kandidatModel.setBrand(kandidat.getBrand());
            kandidatModel.setIntMemory(kandidat.getIntMemory());
            kandidatModel.setPrice(kandidat.getPrice());
            kandidatModel.setProcessor(kandidat.getProcessor());
            kandidatModel.setRam(kandidat.getRam());
            kandidatModel.setRearCamera(kandidat.getRearCamera());
            kandidatModel.setScreen(kandidat.getScreen());
            KandidatModel updateKandidat = kandidatInter.save(kandidatModel);
            translateNilai(updateKandidat);
//        }
        return updateKandidat;
    }

//    JSONArray itemSelectedJson = new JSONArray();
    ObjectMapper mapper = new ObjectMapper();
    ArrayNode arrayNode = mapper.createArrayNode();


    private NilaiModel translateNilai(KandidatModel kandidatModel) {
//        for (int x = 0; x <= 5; x++)
//        KandidatModel kandidatModel = getKandidatById(x);
        nilaiModel.setId(kandidatModel.getId());
            switch (kandidatModel.getRam()) {
                case "8 GB" : nilaiModel.setNilaiRam((double) 1); break;
                case "6 GB" : nilaiModel.setNilaiRam(0.75); break;
                case "4 GB" : nilaiModel.setNilaiRam(0.50); break;
                case "3 GB" : nilaiModel.setNilaiRam(0.25); break;
                case "2 GB" : nilaiModel.setNilaiRam((double) 0); break;
            }
            switch (kandidatModel.getProcessor()) {
                case "Snapdragon" : nilaiModel.setNilaiPro((double) 1); break;
                case "Mediatek" : nilaiModel.setNilaiPro(0.50); break;
                case "Intel" : nilaiModel.setNilaiPro((double) 0); break;
            }
            switch (kandidatModel.getBattery()) {
                case "5001 - 6000" : nilaiModel.setNilaiBattery((double) 1); break;
                case "4001 - 5000" : nilaiModel.setNilaiBattery(0.70); break;
                case "3001 - 4000" : nilaiModel.setNilaiBattery(0.30); break;
                case "2000 - 3000" : nilaiModel.setNilaiBattery((double) 0); break;
            }
            switch (kandidatModel.getPrice()) {
                case "6jt - 7jt" : nilaiModel.setNilaiPrice((double) 1); break;
                case "4jt - 5jt" : nilaiModel.setNilaiPrice(0.75); break;
                case "3jt - 4jt" : nilaiModel.setNilaiPrice(0.50); break;
                case "2jt - 3jt" : nilaiModel.setNilaiPrice(0.0); break;
            }
            switch (kandidatModel.getIntMemory()) {
                case "128 Gb" : nilaiModel.setNilaiIntMemory((double) 1); break;
                case "64 Gb" : nilaiModel.setNilaiIntMemory(0.70); break;
                case "32 Gb" : nilaiModel.setNilaiIntMemory(0.30); break;
                case "16 Gb" : nilaiModel.setNilaiIntMemory((double) 0); break;
            }
            switch (kandidatModel.getScreen()) {
                case "6,1 - 6,5" : nilaiModel.setNilaiScreen((double) 1); break;
                case "5,6 - 6" : nilaiModel.setNilaiScreen(0.70); break;
                case "5,1 - 5,5" : nilaiModel.setNilaiScreen(0.30); break;
                case "4,5 - 5" : nilaiModel.setNilaiScreen((double) 0); break;
            }
            switch (kandidatModel.getRearCamera()) {
                case "16" : nilaiModel.setNilaiRearCamera((double) 1); break;
                case "13" : nilaiModel.setNilaiRearCamera(0.75); break;
                case "12" : nilaiModel.setNilaiRearCamera(0.50); break;
                case "8" : nilaiModel.setNilaiRearCamera(0.25); break;
                case "5" : nilaiModel.setNilaiRearCamera((double) 0); break;
            }
            switch (kandidatModel.getBrand()) {
                case "Samsung" : nilaiModel.setNilaiBrand((double) 1); break;
                case "Oppo" : nilaiModel.setNilaiBrand(0.75); break;
                case "Vivo" : nilaiModel.setNilaiBrand(0.50); break;
                case "Xiaomi" : nilaiModel.setNilaiBrand(0.25); break;
                case "LG" : nilaiModel.setNilaiBrand((double) 0); break;
            }
            NilaiModel updateNilai = nilaiInter.save(nilaiModel);
            return updateNilai;
    }
//    }
}
