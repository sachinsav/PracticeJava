package Practice_Java;
import java.io.*;
public class Anton_A {
public static void main(String args[]) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n = Integer.parseInt(br.readLine());
	String str = br.readLine();
	int a_count=0,d_count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='A')
			a_count+=1;
		else
			d_count+=1;
	}
	//bw.write(a_count+" "+d_count);
	if(a_count>d_count)
		bw.write("Anton");
	else if(a_count<d_count)
		bw.write("Danik");
	else
		bw.write("Friendship");
	
	br.close();
	bw.close();
}
}
