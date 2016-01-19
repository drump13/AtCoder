package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuuretsuGame {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int retsu[] = new int[s.length];
		for(int i = 0 ; i < s.length ; i++){
			retsu[i] = Integer.parseInt(s[i]);
		}		
		int result =Integer.MIN_VALUE;
		for(int i = 0 ; i < retsu.length ;i++){
			int current = getScore(retsu,i);
			result = Math.max(result, current);
		}
		System.out.println(result);
	}
	public static int getScore(int[] retsu,int tak){
		int aoki= Integer.MIN_VALUE;
		int aokiPos = -1;
		for(int i = 0,n = retsu.length; i < n ; i++){
			if(i == tak) continue;
			int score = 0;
			if(i< tak){
				int c = i+1;
				while(c <= tak){
					score += retsu[c];
					c+=2;
				}
			}else{
				int c = tak+1;
				while(c <= i){
					score += retsu[c];
					c+=2;
				}
			}
			if(aoki < score){
				aokiPos = i;
				aoki = score;
			}
		}
		int result=0;
		if(tak < aokiPos){
			for(int i = tak ; i <= aokiPos; i+=2){
				result += retsu[i];
			}
		}else{
			for(int i = aokiPos; i <= tak ; i+= 2){
				result += retsu[i];
			}
		}
		return result;
	}
	
}
