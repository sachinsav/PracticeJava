package Practice_Java;
import java.util.*;

public class Fench {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,h,temp,ans,i;
	n = sc.nextInt();
	h = sc.nextInt();
	ans = n;
	for(i=0;i<n;i++) {
		temp = sc.nextInt();
		if(temp>h) {
			ans+=1;
		}
	}
	System.out.println(ans);
	sc.close();
}
}
