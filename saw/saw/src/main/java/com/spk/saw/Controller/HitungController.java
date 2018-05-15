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

}
