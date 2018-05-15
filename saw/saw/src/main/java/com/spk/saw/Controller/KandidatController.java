package com.spk.saw.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.spk.saw.Exception.ResourceNotFoundException2;
import com.spk.saw.Interface.KandidatInter;
import com.spk.saw.Interface.MatriksInter;
import com.spk.saw.Interface.NilaiInter;
import com.spk.saw.Model.KandidatModel;
import com.spk.saw.Model.MatriksModel;
import com.spk.saw.Model.NilaiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class KandidatController {

    @Autowired
    KandidatInter kandidatInter;
    @Autowired
    NilaiInter nilaiInter;
    @Autowired
    NilaiModel nilaiModel;
    @Autowired
    MatriksModel[] matriksModel;
    @Autowired
    MatriksInter matriksInter;

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
        nilaiModel.setNamaKandidat(kandidatModel.getNamaKandidat());
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
                case "6jt - 7jt" : nilaiModel.setNilaiPrice((double) 0); break;
                case "4jt - 5jt" : nilaiModel.setNilaiPrice(0.25); break;
                case "3jt - 4jt" : nilaiModel.setNilaiPrice(0.50); break;
                case "2jt - 3jt" : nilaiModel.setNilaiPrice(0.75); break;
                case "1jt - 2jt" : nilaiModel.setNilaiPrice((double) 1); break;
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

    //Get all hasil translate
    @GetMapping("/hasil")
    public List<NilaiModel> getAllNilai() {
        hitungMatriks();
        return nilaiInter.findAll();
    }

    public List<NilaiModel> getAllNilai2() {
        return nilaiInter.findAll();
    }

    @GetMapping("/get-matriks")
    public List<MatriksModel> getAllMatriks() {
        return matriksInter.findAll();
    }

//    @PostMapping("/hitung-matriks")
    private MatriksModel[] hitungMatriks() {
        NilaiModel[] nilaiModel = getAllNilai2().toArray(new NilaiModel[0]);
//        MatriksModel[] matriksModels = new MatriksModel[6];
        Double ramMax = 0.0, proMax = 0.0, batMax = 0.0, priceMax = 0.0, intMemoryMax = 0.0, screenMax = 0.0, rearCameraMax = 0.0, brandMax = 0.0;
        for (int x = 0; x < nilaiInter.count(); x++) {
            if (x == 0) {
                ramMax = nilaiModel[x].getNilaiRam();
                proMax = nilaiModel[x].getNilaiPro();
                batMax = nilaiModel[x].getNilaiBattery();
                priceMax = nilaiModel[x].getNilaiPrice();
                intMemoryMax = nilaiModel[x].getNilaiIntMemory();
                screenMax = nilaiModel[x].getNilaiScreen();
                rearCameraMax = nilaiModel[x].getNilaiRearCamera();
                brandMax = nilaiModel[x].getNilaiBrand();
            } else {
                if (nilaiModel[x].getNilaiRam() > ramMax) {
                    ramMax = nilaiModel[x].getNilaiRam();
                }
                if (nilaiModel[x].getNilaiBattery() > batMax) {
                    batMax = nilaiModel[x].getNilaiBattery();
                }
                if (nilaiModel[x].getNilaiBrand() > brandMax) {
                    brandMax = nilaiModel[x].getNilaiBrand();
                }
                if (nilaiModel[x].getNilaiIntMemory() > intMemoryMax) {
                    intMemoryMax = nilaiModel[x].getNilaiIntMemory();
                }
                if (nilaiModel[x].getNilaiPrice() > priceMax) {
                    priceMax = nilaiModel[x].getNilaiPrice();
                }
                if (nilaiModel[x].getNilaiPro() > proMax) {
                    proMax = nilaiModel[x].getNilaiPro();
                }
                if (nilaiModel[x].getNilaiRearCamera() > rearCameraMax) {
                    rearCameraMax = nilaiModel[x].getNilaiRearCamera();
                }
                if (nilaiModel[x].getNilaiScreen() > screenMax) {
                    screenMax = nilaiModel[x].getNilaiScreen();
                }
            }
        }
        MatriksModel[] matriksModelAkhir = new MatriksModel[6];
        for (int x = 0; x < nilaiInter.count(); x++) {
            matriksModel[0].setId(nilaiModel[x].getId());
            matriksModel[0].setNamaKandidat(nilaiModel[x].getNamaKandidat());
            matriksModel[0].setNilaiRam(nilaiModel[x].getNilaiRam() / ramMax);
            matriksModel[0].setNilaiPro(nilaiModel[x].getNilaiPro() / proMax);
            matriksModel[0].setNilaiBrand(nilaiModel[x].getNilaiBrand() / brandMax);
            matriksModel[0].setNilaiBattery(nilaiModel[x].getNilaiBattery() / batMax);
            matriksModel[0].setNilaiPrice(nilaiModel[x].getNilaiPrice() / priceMax);
            matriksModel[0].setNilaiIntMemory(nilaiModel[x].getNilaiIntMemory() / intMemoryMax);
            matriksModel[0].setNilaiScreen(nilaiModel[x].getNilaiScreen() / screenMax);
            matriksModel[0].setNilaiRearCamera(nilaiModel[x].getNilaiRearCamera() / rearCameraMax);

            matriksModelAkhir[x] = matriksInter.save(matriksModel[0]);
        }
        return matriksModelAkhir;
    }
}
