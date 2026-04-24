package com.gla.FilteringExpiringMember;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class GymMembership {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Aman", LocalDate.now().plusDays(10)),
                new Member("Riya", LocalDate.now().plusDays(40)),
                new Member("Karan", LocalDate.now().plusDays(25)),
                new Member("Neha", LocalDate.now().plusDays(5))
        );

        List<Member> expiringSoon = members.stream()
                .filter(m -> m.getExpiryDate().isBefore(LocalDate.now().plusDays(30)))
                .collect(Collectors.toList());

        expiringSoon.forEach(m ->
                System.out.println(m.getName() + " - " + m.getExpiryDate()));
    }
}
