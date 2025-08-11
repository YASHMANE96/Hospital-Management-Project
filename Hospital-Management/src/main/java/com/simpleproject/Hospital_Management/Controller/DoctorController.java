package com.simpleproject.Hospital_Management.Controller;

import com.simpleproject.Hospital_Management.Model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    Map<Integer, Doctor> DoctorMapDB = new HashMap<>();


    @PostMapping("/save")
    public String SaveDoctor(@RequestBody Doctor Doctor){
        DoctorMapDB.put(Doctor.getID(),Doctor);
        System.out.println("Doctor Saved : " + DoctorMapDB);
        return "Doctor Saved Successfully";
    }

    @GetMapping("/findAll")
    public Map<Integer, Doctor> getAllDoctors(){
        return DoctorMapDB;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctorById(@PathVariable int id){
        DoctorMapDB.remove(id);
        return "Doctor removed successfully!";
    }

}
