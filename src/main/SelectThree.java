package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class SelectThree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] nums = new int[s.length];
		for(int i = 0,size = s.length;i<size;i++){
			nums[i] = Integer.parseInt(s[i]);
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < Math.pow(2, s.length);i++){
			String current = Integer.toBinaryString(i);
			if(isCondition(current)){
				current = complement(current, s.length);
				set = condAdd(set, getSum(nums, current));
			}
		}
		System.out.println(getMinimum(set));
	}
	public static int getSum(int[] nums,String binary){
		int sum = 0;
		for(int i = 0 ,l=nums.length; i < l ;i++){
			if(binary.charAt(i)=='1'){
				sum+= nums[i];
			}
		}
		return sum;
	}
	public static String complement(String s ,int l){
		if(s.length() < l){
			for(int i = 0 ; s.length() < l;i++){
				s="0"+s;
			}
		}
		return s;
	}
	public static HashSet<Integer> condAdd(HashSet<Integer> set,int c){
		set.add(c);
		if(set.size() > 3){
			int min = getMinimum(set);
			set.remove(min);
		}
		return set;
	}
	public static int getMinimum(HashSet<Integer> set){
		Iterator it = set.iterator();
		int min = Integer.MAX_VALUE;
		while(it.hasNext()){
			min = Math.min(min,(int) it.next());
		}
		return min;
	}
	public static boolean isCondition(String s){
		int count = 0;
		for(int i = 0,l = s.length() ; i < l;i++){
			if(s.charAt(i)=='1'){
				count++;
			}
		}
		if(count == 3){
			return true;
		}else{
			return false;
		}
	}

}
