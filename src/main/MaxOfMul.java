package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfMul {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int result = 0;
		if(a%2 ==0){
			result = (a/2)*(a/2);
		}else{
			result = (a/2)*(a/2+1);
		}
		System.out.println(result);
	}

}
