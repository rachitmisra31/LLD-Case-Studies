package com.flipmed.hospital;

public class Doctor {

    private final String name;
    private final Specialisation speciality;

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", Speciality='" + speciality + '\'' +
                '}';
    }

    public Doctor(String name, Specialisation speciality){
        this.name = name;
        this.speciality = speciality;
    }
}