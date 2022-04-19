package com.org.cts.service;

import com.org.cts.model.Hospital;
import com.org.cts.repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    HospitalRepo hospitalRepo;

    @Override
    public void createhospital(Hospital hospital) {
        hospitalRepo.save(hospital);

    }

    @Override
    public Hospital getById(Integer id) {
        Hospital hs = hospitalRepo.getById(id);
        return hs;
    }

    @Override
    public List<Hospital> getAll() {
        List<Hospital> ll  = hospitalRepo.findAll();
        return ll;
    }

    @Override
    public String deleteById(Integer id) {
         hospitalRepo.deleteById(id);
        return "success";
    }

    @Override
    public void updateHospital(Hospital hospital) {
        hospitalRepo.save(hospital);


    }
}
