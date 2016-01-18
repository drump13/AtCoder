package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEvaluation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N == 100){
			System.out.println("Perfect");
		}else if(N >= 90){
			System.out.println("Great");

		}else if(N >= 60){
			System.out.println("Good");
			
		}else{
			System.out.println("Bad");
			
		}

	}

}
