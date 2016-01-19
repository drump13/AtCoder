package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Retsu {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		int currentMax = 0;
		long currentNum = 1;
		boolean zeroFlag = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < N ;i++){
			int j = Integer.parseInt(br.readLine());
			if(zeroFlag){continue;}
			if(j == 0){
				zeroFlag = true;
				currentMax = N;
//				break;
			}
			list.add(j);
			currentNum *= j;
			if(currentNum > K){
				while(currentNum>K && list.size() > 0){
					currentNum /= list.get(0);
					list.remove(0);
				}
			}
			
			currentMax=Math.max(currentMax, list.size());
			
		}	
		System.out.println(currentMax);
	}

	public static int getCurrentNum(ArrayList<Integer> list){
		int result = 1;
		for(int i = 0,n = list.size() ; i < n;i++){
			result *= list.get(i);
		}
		return result;
	}
}
