package com.gla.InsuranceClaimAnalysis;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 7000),
                new Claim("Health", 3000),
                new Claim("Vehicle", 9000),
                new Claim("Life", 10000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                Claim::getType,
                                Collectors.averagingDouble(Claim::getAmount)
                        ));

        System.out.println(avgClaimByType);
    }
}
