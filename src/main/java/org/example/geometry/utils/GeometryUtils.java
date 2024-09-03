package org.example.geometry.utils;

public class GeometryUtils {
    public static double convertToMeters(double value, String unit) {
        switch (unit) {
            case "см":
                return value / 100;
            case "мм":
                return value / 1000;
            default:
                return value;
        }
    }
}