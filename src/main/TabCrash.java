package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TabCrash {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int L =Integer.parseInt(s[1]);
		String koudou = br.readLine();
		int crashCount = 0;
		int numOfTab = 1;
		for(int i = 0 ; i < N ; i++){
			if(koudou.charAt(i)=='+'){
				numOfTab++;
			}else{
				numOfTab--;
			}
			if(numOfTab  > L){
				crashCount++;
				numOfTab = 1;
			}
		}
		System.out.println(crashCount);
	}

}
