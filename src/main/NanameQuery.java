package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NanameQuery {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int Q = Integer.parseInt(s[1]);
		int array[][] = new int[N][N];
		ArrayList<String> result = new ArrayList<String>();
		for(int count = 0; count<Q ; count++){
			s = br.readLine().split(" ");
			int code = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			int c = Integer.parseInt(s[3]);
			int d = 0;
			if(code == 3){
				d = Integer.parseInt(s[4]);
			}
			if(code == 1){
				for(int i = 0 ; i < N ;i ++){
					for(int j = 0 ; j < N; j++){
						if(i+j >= a && i+j <= b){
							array[i][j] += c;
						}
						if(i >b && j > b){
							break;
						}
					}
				}
			}else if(code == 2){
				for(int i = 0 ; i < N ;i ++){
					for(int j = 0 ; j < N; j++){
						if(i-j >= a && i-j <= b){
							array[i][j] += c;
						}
					}
				}
			}else{
				int currentMax = Integer.MIN_VALUE;
				int maxCounter = 0;
				for(int i = a ; i <= b ;i ++){
					for(int j = c ; j <= d; j++){
						if(currentMax < array[i][j]){
							currentMax = array[i][j];
							maxCounter =1;
						}else if(currentMax == array[i][j]){
							maxCounter++;
						}
					}
				}
				result.add(String.valueOf(currentMax) +" "+String.valueOf(maxCounter));
			}
//			printArray(array);
		}
		for(int i = 0,size = result.size() ; i <size;i++ ){
			System.out.println(result.get(i));
		}
	}
	
	public static void printArray(int[][] array){
		for(int i = 0 ; i < array.length; i++){
			for(int j = 0 ; j < array.length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("-------");
	}

}
