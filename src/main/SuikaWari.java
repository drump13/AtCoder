package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuikaWari {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s  = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int A = Integer.parseInt(s[1]);
		int B = Integer.parseInt(s[2]);
		int count =0;
		for(int i = 0 ; i < N ;i++){
			s = br.readLine().split(" ");
			int n = Integer.parseInt(s[1]);
			n = n < A ? A : n;
			n = n > B ? B : n;
			if(s[0].equals("East")){
				count += n;
				
			}else{
				count -= n;
			}
		}
		
		if(count == 0){
			System.out.println(count);
		}else if(count > 0){
			System.out.println("East "+count);
		}else{
			System.out.println("West "+Math.abs(count));
		}
	}

}
