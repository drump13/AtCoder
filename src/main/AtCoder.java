package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtCoder {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int b = Integer.parseInt(s[0]);
		int c = Integer.parseInt(s[1]);
		String line= br.readLine();
		int k = a+b+c;
		System.out.println(k+" "+line);
	}

}
