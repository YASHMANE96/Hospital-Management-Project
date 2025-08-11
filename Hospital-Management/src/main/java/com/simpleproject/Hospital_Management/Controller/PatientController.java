package com.simpleproject.Hospital_Management.Controller;

import com.simpleproject.Hospital_Management.Model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/patient/apis")
public class PatientController {
    Map<Integer, Patient> PatientMapDB = new HashMap<>();


    @PostMapping("/save")
    public String SavePatient(@RequestBody Patient Patient){
        PatientMapDB.put(Patient.getID(),Patient);
        System.out.println("Patient Saved : " + PatientMapDB);
        return "Patient Saved Successfully";
    }
    @GetMapping("/findAll")
    public Map<Integer, Patient> getAllDoctors(){
        return PatientMapDB;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctorById(@PathVariable int id){
        PatientMapDB.remove(id);
        return "Doctor removed successfully!";
    }

}
