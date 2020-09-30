package Practice_Java;
import java.io.*;

public class Bear_A16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b,ans=0;
		String str[] = br.readLine().split(" ");
		a = Integer.parseInt(str[0]);
		b = Integer.parseInt(str[1]);
		while(a<=b) {
			a*=3;
			b*=2;
			ans+=1;
		}
		bw.write(String.valueOf(ans));
		br.close();
		bw.close();

	}

}
