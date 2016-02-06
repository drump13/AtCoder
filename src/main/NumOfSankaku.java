package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumOfSankaku {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<PointXY> pList = new ArrayList<PointXY>();
		for(int i = 0 ;i < N ; i++){
			String s[] = br.readLine().split(" ");
			pList.add(new PointXY(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
		}
		int eikaku = 0;
		int tyokkaku = 0;
		int donkaku = 0;
		for(int i = 0;i < N;i++){
			for(int j = 0 ; j < N ;j++){
				for(int k = 0; k < N; k++){
					if(!(i < j &&j < k)){
						continue;
					}
					PointXY p1 = pList.get(i); 
					PointXY p2 = pList.get(j); 
					PointXY p3 = pList.get(k); 
					int naiseki1 = getNaiseki(p1, p2, p3);
					int naiseki2 = getNaiseki(p2, p1, p3);
					int naiseki3 = getNaiseki(p3, p2, p1);
					if(naiseki1 > 0 && naiseki2 > 0 && naiseki3 > 0){
						eikaku++;
					}else if(naiseki1 == 0 || naiseki2 ==0||naiseki3 == 0){
						tyokkaku++;
					}else{
						donkaku++;
					}
				}
			}
		}
		System.out.println(eikaku +" "+tyokkaku +" "+donkaku);
	}
	public static int getNaiseki(PointXY p1,PointXY p2,PointXY p3){
		int x1 = p1.getX() - p2.getX();
		int y1 = p1.getY() - p2.getY();
		
		int x2 = p1.getX() - p3.getX();
		int y2 = p1.getY() - p3.getY();
		
		return x1*x2 +y1*y2;
	}
}
class PointXY{
	private int x;
	private int y;
	PointXY(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
}
