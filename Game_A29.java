package Practice_Java;
import java.io.*;
import java.util.*;

public class Game_A29 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			String temp[]=br.readLine().split(" ");
			al1.add(Integer.parseInt(temp[0]));
			al2.add(Integer.parseInt(temp[1]));
		}
		int ans=0;
		for(int a:al1) {
			ans+=Collections.frequency(al2, a);
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.close();
		
	}
}
