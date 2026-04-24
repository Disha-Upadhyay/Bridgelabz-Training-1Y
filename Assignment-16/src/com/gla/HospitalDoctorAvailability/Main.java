package com.gla.HospitalDoctorAvailability;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true),
                new Doctor("Dr. D", "Dermatology", true)
        );

        List<Doctor> result = doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted(Comparator.comparing(d -> d.specialty))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }


}
