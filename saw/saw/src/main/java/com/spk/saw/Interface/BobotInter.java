package com.spk.saw.Interface;

import com.spk.saw.Model.BobotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BobotInter extends JpaRepository<BobotModel, Integer> {

}
