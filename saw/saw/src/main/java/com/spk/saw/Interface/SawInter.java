package com.spk.saw.Interface;

import com.spk.saw.Model.SawModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SawInter extends JpaRepository<SawModel, Integer> {
}
