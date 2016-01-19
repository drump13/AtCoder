package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DouitsuEnsyu {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Point> list = new ArrayList<Point>();
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
	
		for(int i = 0 ; i < N; i++){
			String s[] = br.readLine().split(" ");
 			int x = Integer.parseInt(s[0]);
 			int y = Integer.parseInt(s[1]);
			list.add(new Point(x,y));
			minX = Math.min(minX, x);
			maxX = Math.max(maxX, x);
			minY = Math.min(minY, y);
			maxY = Math.max(maxY, y);
		}
		int dist = 0;
		
		while(true){
			int centerX = (maxX+minX)/2;
			int centerY = (maxY+minY)/2;
			for(int i = centerX-dist; i < centerX + dist ; i++){
				for(int j =centerY - dist; j < centerY + dist;j++){
					int current=0;
					current= list.get(0).getManhattan(i, j);
					for(int k = 1,size = list.size(); k < size; k++){
						if(list.get(k).getManhattan(i, j) != current){
							break;
						}
						if(k == size-1){
							System.out.println(i + " "+ j);
							return;
						}
					}
				}
			}
			dist++;
		}
		
//		for(int i = minX; i < maxX ; i++){
//			for(int j = minY; j < maxY;j++){
//				int current=0;
//				current= list.get(0).getManhattan(i, j);
//				for(int k = 1,size = list.size(); k < size; k++){
//					if(list.get(k).getManhattan(i, j) != current){
//						break;
//					}
//					if(k == size-1){
//						System.out.println(i + " "+ j);
//						return;
//					}
//				}
//			}
//		}
		
	}

}
class Point{
	private int x;
	private int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	public int getManhattan(int a,int b){
		return Math.abs(x-a) + Math.abs(y-b);
	}

}