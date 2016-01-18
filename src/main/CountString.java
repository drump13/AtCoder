package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] result = new int[6];
				for(int i = 0,l = s.length();i < l ;i++){
					switch (s.charAt(i)) {
					case 'A':		
						result[0]++;
						break;
					case 'B':		
						result[1]++;
						break;
					case 'C':		
						result[2]++;
						break;
					case 'D':		
						result[3]++;
						break;
					case 'E':		
						result[4]++;
						break;
					case 'F':		
						result[5]++;
						break;

					default:
						break;
					}

				}
		for(int i = 0 ; i < result.length; i++){
			if(i == result.length-1){
				System.out.println(result[i]);
			}else{
				System.out.print(result[i]+" ");

			}
		}
	}

}
