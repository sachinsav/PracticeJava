package Practice_Java;
import java.io.*;
public class Night_A28 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int start = 0,ans = 0,dist;
		for(int i=0;i<str.length();i++) {
			int ind = (int)str.charAt(i)-97;
			dist = Math.abs(ind-start);
			ans += Math.min(dist, 26-dist);
			start = ind;
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.close();
	}

}
