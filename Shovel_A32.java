package Practice_Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Shovel_A32 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> ar = Arrays.stream(br.readLine().split(" ")).map(x->Integer.valueOf(x)).collect(Collectors.toList());
		int last_digit = ar.get(0)%10;
		for(int i=1;i<10;i++) {
			if((last_digit*i)%10 == ar.get(1) || (last_digit*i)%10 == 0) {
				bw.write(String.valueOf(i));
				break;
			}
		}
		br.close();
		bw.close();
	}

}
