package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zorome {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int keta = N/9+1;
		int suu = N%9;
		String s = String.valueOf(suu);
		String result = "";
		if(suu == 0){
			s = "9";
			keta -= 1;
		}
		for(int i = 0 ; i < keta ;i ++){
			result +=s; 
		}
		System.out.println(result);
		
	}

}
