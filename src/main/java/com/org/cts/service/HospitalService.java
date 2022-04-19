package com.org.cts.service;

import com.org.cts.model.Hospital;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface HospitalService {

    public void createhospital( Hospital hospital);
    public Hospital getById(Integer id);
    public List<Hospital> getAll();
    public String deleteById(Integer id);
    public void updateHospital(Hospital hospital);
}
