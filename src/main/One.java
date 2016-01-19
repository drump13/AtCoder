package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count=0;
		int total= 0;
		int num = N;
		while(num > 0){
			int a = num / 10;
			int b = num % 10;
			double power = Math.pow(10,count);
			if(b == 0){
				total += a*power;
			}else if(b == 1){
				total += a*power + N%power+1;
			}else{
				total += (a+1)*power;
			}
			num = a;
			count++;
		}
		System.out.println(total);
	}
}
