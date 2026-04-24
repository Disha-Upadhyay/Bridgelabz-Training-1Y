package com.gla.HospitalDoctorAvailability;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}
