package com.gla.Top5TrendingMovies;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Movies {
    String name;
    double rating;
    int year;

    public Movies(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " (" + year + ") - Rating: " + rating;
    }
}
