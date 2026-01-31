package com.flipmed.hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DoctorRegisteryService {

    public final Map<String, Doctor> doctorMap = new HashMap<>();

    public String registerDoctor(String name, String specialisationStr){
        if(doctorMap.containsKey(name)){
            return "Doctor already registered!! ";
        }

        Specialisation specialisation;
        try{
            specialisation = Specialisation.valueOf(specialisationStr.toUpperCase());
        }
        catch (IllegalArgumentException e){
            return "Invalid speciality "+specialisationStr;
        }
        doctorMap.put(name, new Doctor(name, specialisation));
        return "Welcome Dr. "+name;
    }

    public Doctor getDoctorByName(String name){
        return doctorMap.get(name);
    }

    public Collection<Doctor> getAllDoctors(){
        return doctorMap.values();
    }
}