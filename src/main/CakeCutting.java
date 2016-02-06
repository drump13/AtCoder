package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CakeCutting {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int width = Integer.parseInt(s[0]);
		int height = Integer.parseInt(s[1]);
		int n = Integer.parseInt(s[2]);
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0 ; i < n ;i++){
			s = br.readLine().split(" ");
			x[i] = Integer.parseInt(s[0]);
			y[i] = Integer.parseInt(s[1]);
		}
		ArrayList<Tuple> list = new ArrayList<Tuple>();
		for(int i = 0 ;i <= height-1;i++){
			if(check(x,y,width,i,n)){
				list.add(new Tuple(i,width));
			}
		}
		for(int i = 1; i <= width;i++){
			if(check(x,y,i,height,n)){
				list.add(new Tuple(height,i));
			}
		}
		if(list.isEmpty()){
			System.out.println(-1);
		}else{
			printTupleList(list);
		}
		
	}
	public static void printTupleList(ArrayList<Tuple> list){
		for(int i=0,size = list.size();i < size;i++){
			list.get(i).print();
			
		}
	}
	
	public static boolean check(int[] xs,int[] ys,int x,int y,int n){
		int count= 0;
		if(count%2 ==1){
			return false;
		}
		double d = (double) x/y;
		for(int i = 0; i < n ;i++){
			if(d*xs[i] == ys[i]){
				return false;
			}
			if(d*xs[i] >ys[i]){
				count++;
			}
		}
		return count == n/2;
		
	} 
}
class Tuple{
	private int x;
	private int y;
	public Tuple(int x, int y ) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
}
