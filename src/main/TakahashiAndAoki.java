package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakahashiAndAoki {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int a = Integer.parseInt(br.readLine());
	     int b = Integer.parseInt(br.readLine());
	     int n = Integer.parseInt(br.readLine());
	     for(int i = n;;i++){
	    	 if(i%a == 0 && i%b == 0){
	    		 System.out.println(i);
	    		 break;
	    	 }
	     }
	}

}
