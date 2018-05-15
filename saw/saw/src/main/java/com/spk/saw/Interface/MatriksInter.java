package com.spk.saw.Interface;

import com.spk.saw.Model.MatriksModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriksInter extends JpaRepository<MatriksModel, Integer> {
}
