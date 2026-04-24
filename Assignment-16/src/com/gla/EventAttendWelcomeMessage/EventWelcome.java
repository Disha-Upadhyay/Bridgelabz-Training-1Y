package com.gla.EventAttendWelcomeMessage;
import java.util.Arrays;
import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Aman", "Neha", "Rohit", "Priya");


        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!"));
    }
}
