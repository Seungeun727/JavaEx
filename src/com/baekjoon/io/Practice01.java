package com.baekjoon.io;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String getName = scanner.nextLine();
        if(getName.equals(getName)) {
          System.out.println(getName + "??!"); 
        } else {
          System.out.println(getName);
        }        
	}
}