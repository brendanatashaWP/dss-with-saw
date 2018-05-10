package com.spk.saw.Controller;

import com.spk.saw.Interface.BobotInter;
import com.spk.saw.Model.BobotModel;
import com.spk.saw.Exception.ResourceNotFoundException2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BobotController {

    @Autowired
    BobotInter bobotInter;

    //Post bobot
    @PostMapping("/step1")
    public BobotModel isiBobot(@Valid @RequestBody BobotModel bobot) {
        return bobotInter.save(bobot);
    }

    //Get All
    @GetMapping("/step1")
    public List<BobotModel> getAllBobot() {
        return bobotInter.findAll();
    }

    //Get 1 id
    @GetMapping("/step1/{id}")
    public BobotModel getBobotById(@PathVariable(value = "id") Integer id) {
        return bobotInter.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException2("BobotModel", "id", id));
    }

    //Update bobot
    @PutMapping("/step1/{id}")
    public BobotModel updateBobot(@PathVariable(value = "id") Integer id,
                                  @Valid @RequestBody BobotModel bobot) {
        BobotModel bobotModel = bobotInter.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException2("BobotModel", "id", id));
        bobotModel.setBobotBattery(bobot.getBobotBattery());
        bobotModel.setBobotBrand(bobot.getBobotBrand());
        bobotModel.setBobotInternalMemory(bobot.getBobotInternalMemory());
        bobotModel.setBobotPrice(bobot.getBobotPrice());
        bobotModel.setBobotPro(bobot.getBobotPro());
        bobotModel.setBobotRam(bobot.getBobotRam());
        bobotModel.setBobotRearCamera(bobot.getBobotRearCamera());
        bobotModel.setBobotScreen(bobot.getBobotScreen());

        BobotModel updateBobot = bobotInter.save(bobotModel);
        return updateBobot;
    }

}
