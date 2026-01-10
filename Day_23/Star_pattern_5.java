package com.java.patterns;

public class Star_pattern_5 {

	    public static void main(String[] args) {
	        int n = 6; // Number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= (n - i); j++) {
	                System.out.print("  ");
	            }

	            // Print the first star
	            System.out.print("*");

	            // Print spaces between the stars
	            for (int j = 1; j < (2 * (i - 1)); j++) {
	                System.out.print("  ");
	            }

	            // Print the second star (skip for the first row)
	            if (i != 1) {
	                System.out.print(" *");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}
