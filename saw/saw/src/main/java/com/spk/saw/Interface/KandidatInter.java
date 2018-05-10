package com.spk.saw.Interface;

import com.spk.saw.Model.KandidatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KandidatInter extends JpaRepository <KandidatModel, Integer> {
}
