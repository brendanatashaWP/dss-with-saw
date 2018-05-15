package com.spk.saw.Controller;

import com.spk.saw.Exception.ResourceNotFoundException2;
import com.spk.saw.Interface.BobotInter;
import com.spk.saw.Interface.MatriksInter;
import com.spk.saw.Interface.SawInter;
import com.spk.saw.Model.BobotModel;
import com.spk.saw.Model.KandidatModel;
import com.spk.saw.Model.MatriksModel;
import com.spk.saw.Model.SawModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SawController {

    @Autowired
    SawModel[] sawModel;
    @Autowired
    SawModel sawModel2;
    @Autowired
    SawInter sawInter;
    @Autowired
    BobotModel bobotModel;
    @Autowired
    BobotInter bobotInter;
    @Autowired
    MatriksModel matriksModel;
    @Autowired
    MatriksInter matriksInter;

    public List<BobotModel> getAllBobot() {
        return bobotInter.findAll();
    }

    public List<MatriksModel> getAllMatriks() {
        return matriksInter.findAll();
    }

//    @PutMapping("/hitung-saw2/{id}")
    public SawModel[] hitungSaw() {
        BobotModel[] bobotModels = getAllBobot().toArray(new BobotModel[0]);
        MatriksModel[] matriksModels = getAllMatriks().toArray((new MatriksModel[0]));
        SawModel[] sawModels = new SawModel[6];
        double hasilSaw =0;
        for (int x = 0; x < matriksInter.count(); x++){
            hasilSaw = bobotModels[0].getBobotRam() * matriksModels[x].getNilaiRam() +
                    (bobotModels[0].getBobotBattery() * matriksModels[x].getNilaiBattery()) +
                    (bobotModels[0].getBobotBrand() * matriksModels[x].getNilaiBrand()) +
                    (bobotModels[0].getBobotInternalMemory() * matriksModels[x].getNilaiIntMemory()) +
                    (bobotModels[0].getBobotPrice() * matriksModels[x].getNilaiPrice()) +
                    (bobotModels[0].getBobotPro() * matriksModels[x].getNilaiPro()) +
                    (bobotModels[0].getBobotRearCamera() * matriksModels[x].getNilaiRearCamera()) +
                    (bobotModels[0].getBobotScreen() * matriksModels[x].getNilaiScreen());
            sawModel[0].setId(matriksModels[x].getId());
            sawModel[0].setNamaKandidat(matriksModels[x].getNamaKandidat());
            sawModel[0].setHasilSaw(hasilSaw);
            System.out.println(matriksModels[x].getNamaKandidat());
//            System.out.println("Bobot ram:" + bobotModels[0].getBobotRam());
//            System.out.println("Nilai ram:" + matriksModels[x].getNilaiRam());
//            System.out.println("Hasil ram: " + (bobotModels[0].getBobotRam() * matriksModels[x].getNilaiRam()) );
//            System.out.println("Bobot pro:" + bobotModels[0].getBobotPro());
//            System.out.println("Nilai pro:" + matriksModels[x].getNilaiPro());
//            System.out.println("Hasil pro:" + (bobotModels[0].getBobotPro() * matriksModels[x].getNilaiPro()));
//            System.out.println("Bobot bat:" + bobotModels[0].getBobotBattery());
//            System.out.println("Nilai bat:" + matriksModels[x].getNilaiBattery());
//            System.out.println("Hasil bat:" + (bobotModels[0].getBobotBattery() * matriksModels[x].getNilaiBattery()));
//            System.out.println("Bobot harga:" + bobotModels[0].getBobotPrice());
//            System.out.println("Nilai harga:" + matriksModels[x].getNilaiPrice());
//            System.out.println("Hasil harga:" + (bobotModels[0].getBobotPrice() * matriksModels[x].getNilaiPrice()));
//            System.out.println("Bobot intmem:" + bobotModels[0].getBobotInternalMemory());
//            System.out.println("Nilai intmem:" + matriksModels[x].getNilaiIntMemory());
//            System.out.println("Hasil intmem:" + (bobotModels[0].getBobotInternalMemory() * matriksModels[x].getNilaiIntMemory()));
//            System.out.println("Bobot screen:" + bobotModels[0].getBobotScreen());
//            System.out.println("Nilai screen:" + matriksModels[x].getNilaiScreen());
//            System.out.println("Hasil screen:" + (bobotModels[0].getBobotScreen() * matriksModels[x].getNilaiScreen()));
//            System.out.println("Bobot cam:" + bobotModels[0].getBobotRearCamera());
//            System.out.println("Nilai cam:" + matriksModels[x].getNilaiRearCamera());
//            System.out.println("Hasil cam:" + (bobotModels[0].getBobotRearCamera() * matriksModels[x].getNilaiRearCamera()));
//            System.out.println("Bobot brand:" + bobotModels[0].getBobotBrand());
//            System.out.println("Nilai brand:" + matriksModels[x].getNilaiBrand());
//            System.out.println("Hasil brand:" + (bobotModels[0].getBobotBrand() * matriksModels[x].getNilaiBrand()));
            sawModels[x] = sawInter.saveAndFlush(sawModel[0]);
        }
        return sawModels;
    }

    @GetMapping("/hitung-saw")
    public List<SawModel> getAllSaw() {
        hitungSaw();
        return sawInter.findAll();
    }

    @GetMapping("/get-max/{id}")
    private SawModel getMaxSaw (@PathVariable(value = "id") Integer id) {
        return sawInter.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException2("SawModel", "id", id));
    }

    @GetMapping("/get-id")
    private Integer getMaxId() {
        Double maxSaw = 0.0;
        int id= 0;
        SawModel[] sawModels = getAllSaw().toArray(new SawModel[0]);
        for (int x = 0; x < sawInter.count(); x++) {
            if (x == 0) {
                maxSaw = sawModels[x].getHasilSaw();
                id = sawModels[x].getId();
            } else {
                if (sawModels[x].getHasilSaw() > maxSaw) {
                    maxSaw = sawModels[x].getHasilSaw();
                    id = sawModels[x].getId();
                }
            }
        }
        return id;
    }
}
