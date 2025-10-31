package com.farhan.trading212tracker.controller;

import java.io.*;

public class TradeController {
    public static void main(String[] args) {
        String line;
        InputStream input = TradeController.class.getResourceAsStream("/sept-oct-2025.csv");

        if (input == null) {
            System.out.println("Error: Could not find 'sept-oct-2025.csv' in resources folder!");
            return;
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
