package com.gla.AIDrivenResumeScreeningSystem;
import java.util.List;
public class ScreeningPipeline {
    public static void processAll(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println(r.getDetails());
        }
    }

}
