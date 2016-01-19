package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UndouKanri {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int L = Integer.parseInt(s[0]);
		int H = Integer.parseInt(s[1]);
		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N];
		for(int i = 0 ; i < N ; i++){
			int a = Integer.parseInt(br.readLine());
			if(L > a){
				result[i] = L-a;
			}else if(H < a){
				result[i] = -1;
			}else{
				result[i] = 0;
			}
		}
		for(int i= 0 ; i < result.length ; i++){
			System.out.println(result[i]);
		}
	}

}
