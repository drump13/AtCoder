package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		if(s[1].equals(s[0])){
			System.out.println(s[2]);
		}else if(s[2].equals(s[1])){
			System.out.println(s[0]);
		
		}else if(s[0].equals(s[2])){
			System.out.println(s[1]);
			
		}
	}

}
