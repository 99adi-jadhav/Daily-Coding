package com.java.patterns;

public class Star_pattern_6 {

	
	public static void main(String[] args) {
			
			int n = 5;
	        int i, space, j;

	        for (i = 1; i <= n; i++) {

	            for (space = 1; space <= n - i; space++) {

	                System.out.print(" ");
	            }

	            for (j = 1; j <= 2 * i - 1; j++) {

	                System.out.print("*");
	            }

	            System.out.println();  
	        }
			for(i = n-1 ; i >= 1 ; i--) {
				
				for(space = 1 ; space  <= n-i ; space++) {
					
					System.out.print(" ");
				}
				
				for(j = 1 ; j <= 2*i-1 ; j++) {
					
					System.out.print("*");
					
				}
				System.out.println();
				
			}

		}

	}