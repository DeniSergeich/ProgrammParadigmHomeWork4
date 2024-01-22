package org.example;

import org.apache.commons.math4.legacy.stat.correlation.PearsonsCorrelation;

public class Main {
    public static void main(String[] args) {
        double[] arr1 = {12, 5, 4, 15, 66, 41};
        double[] arr2 = {15, 12, 8, 4, 55, 8};
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        double correlation = pearsonsCorrelation.correlation(arr1, arr2);
        System.out.println("Корреляция Пирсона: " + correlation);
    }
}