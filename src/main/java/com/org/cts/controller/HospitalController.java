package com.org.cts.controller;

import com.org.cts.model.Hospital;
import com.org.cts.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;

    @PostMapping("/create")
    public void createhospital(@RequestBody Hospital hospital){
        hospitalService.createhospital(hospital);
    }

    @GetMapping("/getBYId/{id}")
    public Hospital getById(@PathVariable Integer id){
        Hospital hospital = hospitalService.getById(id);
        return hospital;
    }
    @GetMapping("/getAll")
    public List<Hospital> getAll(){
        List<Hospital> sir= hospitalService.getAll();
        return sir;

    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        String ss =  hospitalService.deleteById(id);
        return ss;
    }
    @PutMapping("/update")
    public void updateHospital(@RequestBody Hospital hospital){
        hospitalService.updateHospital(hospital);

    }

}
