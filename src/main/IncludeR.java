package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncludeR {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for(int i = 0;i < 12 ; i++){
			String line = br.readLine();
			if(line.indexOf("r") != -1){
				count++;
			}
		}
		System.out.println(count);
	}

}
