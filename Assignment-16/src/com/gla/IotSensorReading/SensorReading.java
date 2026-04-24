package com.gla.IotSensorReading;
import java.util.Arrays;
import java.util.List;

public class SensorReading {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(22.5, 30.2, 18.9, 35.6, 27.0);

        double threshold = 25.0;

        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value -> System.out.println("High Reading: " + value));
    }
}
