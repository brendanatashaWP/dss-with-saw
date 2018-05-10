package com.spk.saw.Interface;

import com.spk.saw.Model.NilaiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NilaiInter extends JpaRepository<NilaiModel, Double> {
}
