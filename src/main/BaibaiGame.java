package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaibaiGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		n++;
		int count = 0;
		while(n > 1){
			if(count %2 ==0){
				n = (n%2 == 0)? n/2:(n+1)/2 ;
			}else{
				n = (n%2 == 0)? n/2:(n-1)/2; 
			}
			count++;
		}
		if(count%2 == 0){
			System.out.println("Takahashi");
		}else{
			System.out.println("Aoki");
		}
	}

}
