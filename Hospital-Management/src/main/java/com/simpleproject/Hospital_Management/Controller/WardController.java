package com.simpleproject.Hospital_Management.Controller;

import com.simpleproject.Hospital_Management.Model.Ward;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ward/apis")
public class WardController {
    Map<Integer, Ward> WardMapDB = new HashMap<>();


    @PostMapping("/save")
    public String SaveWard(@RequestBody Ward Ward){
        WardMapDB.put(Ward.getID(),Ward);
        System.out.println("Ward Saved : " + WardMapDB);
        return "Ward Saved Successfully";
    }

    @GetMapping("/findAll")
    public Map<Integer, Ward> getAllDoctors(){
        return WardMapDB;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctorById(@PathVariable int id){
        WardMapDB.remove(id);
        return "Doctor removed successfully!";
    }
}
