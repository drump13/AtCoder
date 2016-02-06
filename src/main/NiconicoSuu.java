package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NiconicoSuu {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int currentNum = 1;
		int nico= 25;
		int result= 0;
		while(currentNum*nico <= N){
			result++;
			currentNum ++;
		}
		System.out.println(result);
	}

}
