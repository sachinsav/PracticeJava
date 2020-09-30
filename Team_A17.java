package Practice_Java;
import java.io.*;
import java.util.Arrays;
public class Team_A17 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n,ans=0,tmp;
		n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(x->x==1).reduce(0,(a,b) -> a+b);
			if(tmp>1) ans+=1;
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.close();
	}
}
