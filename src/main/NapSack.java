package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NapSack {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int W = Integer.parseInt(s[1]);
		long[][] array = new long[2][W+1];
		for(int i = 0 ; i < N ; i++){
			s = br.readLine().split(" ");
			int v= Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			for(int j= 0 ; j <= W - w;j++){
				array[1][j]= array[0][j];
				array[1][j+w] = array[0][j] + v;
			}
			array[0] = array[1];
		}
		System.out.println(array[1][W]);
//		Map<Long,Long> map = new HashMap<Long, Long>();
//		map.put(0l, 0l);
//		for(int i = 0 ; i < N ;i++){
//			s = br.readLine().split(" ");
//			int v= Integer.parseInt(s[0]);
//			int w = Integer.parseInt(s[1]);
//			Map<Long,Long> currentMap = new HashMap<Long, Long>();
//			for(long key:map.keySet()){
//				currentMap.put(key, map.get(key));
//				if(key+w <= W){
//					if(map.containsKey(key+w)){
//						currentMap.put(key+w, Math.max(map.get(key+w),map.get(key)+v));
//					}else{
//						currentMap.put(key+w, map.get(key)+v);
//					}
//				}
//			}
//			map = currentMap;
//		}
//		long result = 0l;
//		for(long key: map.keySet()){
//			result =Math.max(result,map.get(key));
//		}
//		System.out.println(result);
	}

}
