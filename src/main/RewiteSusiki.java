package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RewiteSusiki {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] s = line.split("\\+");
		int result = 0;
		for(int i = 0, n=s.length ;i <n;i++){
			String [] current =s[i].split("\\*");
			boolean flag = false;
			for(int j = 0; j < current.length;j++ ){
				if(Integer.parseInt(current[j]) == 0){
					flag = true;
				}
			}
			if(!flag){
				result++;
			}
		}
		System.out.println(result);
	}

}
