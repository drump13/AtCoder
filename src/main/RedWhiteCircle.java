package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RedWhiteCircle {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < a;i++){
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		double sum = 0;
		for(int i = 0 ; i < a ; i++){
			double r = list.get(i);
			if(i%2 == 0){
				sum += r*r;
			}else{
				sum -=r*r;
			}
		}
		sum *= Math.PI;
		System.out.println(sum);
	}

}
