package com.gla.Top5TrendingMovies;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Movies> movies = Arrays.asList(
                new Movies("MovieA", 8.5, 2023),
                new Movies("MovieB", 9.0, 2024),
                new Movies("MovieC", 7.8, 2022),
                new Movies("MovieD", 8.9, 2024),
                new Movies("MovieE", 9.2, 2023),
                new Movies("MovieF", 8.0, 2021)
        );

        List<Movies> topMovies = movies.stream()
                .filter(m -> m.year >= 2022) // optional filter condition
                .sorted((m1, m2) -> {
                    if (m2.rating == m1.rating)
                        return m2.year - m1.year; // latest year first if same rating
                    return Double.compare(m2.rating, m1.rating); // highest rating first
                })
                .limit(5)
                .collect(Collectors.toList());

        topMovies.forEach(System.out::println);
    }
}
