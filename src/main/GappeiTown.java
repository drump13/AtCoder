package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GappeiTown {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] townName = new String[N];
		int[] zinko = new int[N]; 
		for(int i=0; i< N;i++){
			String[] s = br.readLine().split(" ");
			townName[i] = s[0];
			zinko[i] = Integer.parseInt(s[1]);
		}
		int sumOfZinko = 0;
		int maxOfZinko = 0;
		int maxIndex = 0;
		for(int i = 0 ; i < N ; i++){
			sumOfZinko += zinko[i];
			if(zinko[i]>maxOfZinko){
				maxOfZinko = zinko[i];
				maxIndex = i;
			}
		}
		if(sumOfZinko/2 < maxOfZinko){
			System.out.println(townName[maxIndex]);
		}else{
			System.out.println("atcoder");
		}
		
		
	}

}
