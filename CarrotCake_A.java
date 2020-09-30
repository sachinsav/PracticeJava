package Practice_Java;
import java.util.*;
import java.io.*;

public class CarrotCake_A {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ar[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n=ar[0],t=ar[1],k=ar[2],d=ar[3];
		int oven1_cycle = (int)Math.ceil((float)n/k);
		int time_oven1 = t*(oven1_cycle-1);
		if(time_oven1 <= d)
			bw.write("NO");
		else
			bw.write("YES");
		br.close();
		bw.close();
	}
}
