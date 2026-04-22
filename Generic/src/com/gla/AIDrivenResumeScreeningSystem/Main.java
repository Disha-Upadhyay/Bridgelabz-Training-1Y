package com.gla.AIDrivenResumeScreeningSystem;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Aman", new SoftwareEngineer(), 3);

        Resume<DataScientist> r2 =
                new Resume<>("Riya", new DataScientist(), 1);

        Resume<ProductManager> r3 =
                new Resume<>("Karan", new ProductManager(), 4);

        ScreeningUtils.screenResume(r1);
        ScreeningUtils.screenResume(r2);
        ScreeningUtils.screenResume(r3);

        List<Resume<? extends JobRole>> allResumes = Arrays.asList(r1, r2, r3);

        System.out.println("\nAll Candidates:");
        ScreeningPipeline.processAll(allResumes);
    }
}
