package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mojiretsu25 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0 ;  i<5;i++){
			for(int j = 0 ; j < 5 ; j++){
				char c1 = s.charAt(i);
				char c2 = s.charAt(j);
				count++;
				if(count == n){
					System.out.println(String.valueOf(c1)+String.valueOf(c2));;
					break;
				}
				
			}
		}
	}

}
