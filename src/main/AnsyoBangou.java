package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnsyoBangou {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if(s.charAt(0) == s.charAt(1) &&
				s.charAt(1) == s.charAt(2) &&
				s.charAt(2) == s.charAt(3)){
			System.out.println("SAME");
		}else{
			System.out.println("DIFFERENT");
		}
	}

}
