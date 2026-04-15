package com.gla.AIDrivenResumeScreeningSystem;

public class ScreeningUtils {
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening: " + resume.getDetails());

        if (resume.getExperience() >= 2) {
            System.out.println("Status: Shortlisted ✅");
        } else {
            System.out.println("Status: Rejected ❌");
        }
    }
}
