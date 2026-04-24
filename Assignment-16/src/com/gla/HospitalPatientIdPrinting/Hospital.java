package com.gla.HospitalPatientIdPrinting;
import java.util.Arrays;
import java.util.List;
public class Hospital {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103", "P104");

        patientIDs.forEach(System.out::println);
    }
}
