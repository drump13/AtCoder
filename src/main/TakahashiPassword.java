package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class TakahashiPassword {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     String s = br.readLine();
	     int l = Integer.parseInt(br.readLine());
	     HashSet<String> set = new HashSet<String>();
	     int i = 0;
	     while(i+l < s.length()+1){
	    	 set.add(s.substring(i,i+l));
	    	 i++;
	     }
	     System.out.println(set.size());
	}

}
