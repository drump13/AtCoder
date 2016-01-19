package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ishitori {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		if(A==B){
			if(N%(A+1)!=0){
				System.out.println("Takahashi");
			} else{
				System.out.println("Aoki");
			}
		}else if(A > B){
			System.out.println("Takahashi");
		}else{
			if(N<=A){
				System.out.println("Takahashi");
			}else{
				System.out.println("Aoki");
			}
		}
		
	}

}
