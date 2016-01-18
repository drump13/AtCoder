package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IslandAndBridge {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int island[] = new int[n];
		String s[] =br.readLine().split(" "); 
		for(int i = 0 ; i < n ;i++){
			island[i] = Integer.parseInt(s[i]);
		}
		int ave = getSum(island)/n;
		int sum = 0;
		int count=0;
		for(int i = 0 ; i < n ; i++){
			sum += island[i];
			if(sum/(i+1) !=ave ||sum%(i+1) != 0){
				count++;
			}else{
				continue;
			}
		}
		if(sum%n != 0 ){
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
	}
	
	public static int getSum(int[] island){
		int sum = 0;
		for(int i = 0,n = island.length;i < n ; i++){
			sum+= island[i];
		}
		return sum;
	}

}
