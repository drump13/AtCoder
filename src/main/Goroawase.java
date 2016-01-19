package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goroawase {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int K = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		String[] code = new String[N];
		String[] moji = new String[N];
		for(int i = 0 ; i < N; i++){
			s = br.readLine().split(" ");
			code[i] = s[0];
			moji[i] = s[1];
		}
		test(K,moji,code);
	}
	public static void test(int K,String[] moji,String[] code){
		String[] pattern = new String[K];
		int[] lengths = new int[K];
		for(int i = 0,n = (int) Math.pow(3, K) ; i < n;i++){
			int current=i;
			for(int j = K-1 ; j >= 0;j--){
				lengths[j] =  current % 3;
				lengths[j]+=1;
				current = current/3;
			}
			pattern = getPattern(lengths,moji,code);
			if(isThisPattern(moji, code, pattern)){
				break;
			}
		}
		for(int i= 0 ; i < pattern.length ; i++){
			System.out.println(pattern[i]);
		}
	}
	public static String[] getPattern(int[] lengths,String[] moji,String[] code){
		String[] pattern = new String[lengths.length];
		for(int i = 0,n = moji.length ; i <n;i++ ){
			int current = 0;
			for(int j = 0,m = code[i].length();j<m;j++){
				try{
					pattern[Character.getNumericValue(code[i].charAt(j))-1]=
							moji[i].substring(current, current+lengths[Character.getNumericValue(code[i].charAt(j))-1]);
					current += +lengths[Character.getNumericValue(code[i].charAt(j))-1];
				}catch(IndexOutOfBoundsException e){
					return pattern;
				}
			}
		}
		return pattern;
	}
	public static boolean isThisPattern(String[] moji,String[] code,String[] pattern){
		for(int i = 0,n=moji.length ; i < n;i++){
			String s = "";
			for(int j = 0,m = code[i].length(); j < m;j++){
				
				s += pattern[Character.getNumericValue(code[i].charAt(j))-1];
			}
			if(!s.equals(moji[i])){
				return false;
			}
		}
		return true;
	}

}
