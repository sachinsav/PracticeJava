package Practice_Java;
import java.io.*;
import java.util.*;

public class DieRoll_A35 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ar[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int max = Math.max(ar[0], ar[1]);
		int choices = 7-max;
		if(choices==6)
			bw.write("1/1");
		else if(choices==3)
			bw.write("1/2");
		else if(choices==2)
			bw.write("1/3");
		else if(choices==4)
			bw.write("2/3");
		else
			bw.write(String.valueOf(choices)+"/6");
		
		br.close();
		bw.close();
	}

}
