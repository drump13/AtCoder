package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BluteForce {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Character> list = Arrays.asList('a','b','c');
		int a = (int) Math.pow(3, N);
		for(int i = 0 ; i <a;i++){
			for(int j = N-1 ; j >= 0 ; j--){
				int k = (i/(int)Math.pow(3, j))%3;
				System.out.print(list.get(k));
			}
			System.out.println("");

		}
	}

}
