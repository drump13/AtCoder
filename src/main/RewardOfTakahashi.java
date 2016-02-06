package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RewardOfTakahashi {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int syain[] = new int[N];
		int reward[] = new int[N];
		reward[0] =1; 
		for(int i = 1; i < N;i++){
			syain[i]= Integer.parseInt(br.readLine())-1;
			reward[i] = 1;
		}
		int count = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE ;
		
		for(int i = N-1;i>=0;i--){
			for(int j = N-1; j >i;j--){
				if(syain[j] == i){
					min = Math.min(min, reward[j]);
					max = Math.max(max, reward[j]);
					count++;
				}
			}
		
			if(count > 0){
				reward[i] = min+max+1;
				count = 0;
			}
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		System.out.println(reward[0]);
	}
	
	
}

