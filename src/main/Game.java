package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int  a = Integer.parseInt(s[0]);
		int  b = Integer.parseInt(s[1]);
		System.out.println(Math.max((a+1)*b,a*(b+1)));
		
	}

}
