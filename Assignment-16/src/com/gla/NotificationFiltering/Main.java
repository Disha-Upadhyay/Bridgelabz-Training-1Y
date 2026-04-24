package com.gla.NotificationFiltering;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate high", "CRITICAL", 5),
                new Alert("Medicine reminder", "NORMAL", 2),
                new Alert("Low oxygen level", "CRITICAL", 4)
        );
        Predicate<Alert> filter = a->a.type.equals("Critical");

        alerts.stream()
                .filter(filter)
                .forEach(a->System.out.println(a.message
                ));
    }
}
