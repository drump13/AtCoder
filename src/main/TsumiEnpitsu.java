package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TsumiEnpitsu {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s =br.readLine().split(" ");
		int b[] = new int[s.length];
		int result[] = new int[N];
		for(int i = 0 ; i < s.length ; i ++){
			b[i] = Integer.parseInt(s[i]);
		}
		result[0]=b[0];
		for(int i = 1 ; i < N;i++){
			if(i == N-1){
				result[i] = b[s.length-1];
				break;
			}
			if(b[i-1] <= b[i]){
				result[i] = b[i-1];
			}else{
				result[i] = b[i];
			}
		}
		print(result);
	}
	public static void print(int[] result){
		for(int i = 0 ,l = result.length; i < l;i++){
			if(i == l-1){
				System.out.println(result[i]);
			}else{
				System.out.print(result[i]+" ");
			}
		}
	}

}
