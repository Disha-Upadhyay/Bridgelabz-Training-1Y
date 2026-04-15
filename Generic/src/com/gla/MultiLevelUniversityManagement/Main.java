package com.gla.MultiLevelUniversityManagement;

public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Java Programming"));
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Robotics"));

        System.out.println("Exam Courses:");
        UniversityUtils.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        UniversityUtils.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        UniversityUtils.displayCourses(researchCourses.getCourses());
    }
}
