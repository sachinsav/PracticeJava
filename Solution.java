package Practice_Java;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int n = s.length();
        String ar[] = new String[n-k+1];
        for(int i=0;i<=n-k;i++){
            ar[i] = s.substring(i,i+k);
            //System.out.println(ar[i]);
        }
 
        sort(ar);
        smallest = ar[0];
        largest = ar[ar.length-1];
        return smallest + "\n" + largest;
    }
    public static boolean ls(String s1,String s2){
        return s1.compareTo(s2)<0?true:false;
    }
    public static void sort(String[] ar){
        sorte(ar,0,ar.length-1);
    }
    public static void sorte(String[] ar,int start,int end){
        if (start < end){
            int mid = (start+end)/2;
            sorte(ar,start,mid);
            sorte(ar,mid+1,end);
            merge(ar,start,mid,end);
        }
    }
    public static void merge(String[] ar,int start,int mid,int end){
        String[] temp = new String[start+end+1];
        int sl = start;
        int ml = mid+1;
        int i = 0;
        while(sl<=mid && ml<=end){
            if(ls(ar[sl],ar[ml]))
            {
                temp[i] = ar[sl];
                sl += 1;
            }
            else{
                temp[i] = ar[ml];
                ml += 1;
            }
            i += 1;
        }
        try {
        while(sl<=mid){
            temp[i] = ar[sl];
            sl += 1;
            i+=1;
        }
        }catch(Exception e) {
        	System.out.println(i+" "+sl);
        }
        while(ml<=end){
            temp[i] = ar[ml];
            ml += 1;
            i += 1;
        }
        i = 0;
        for(int k=start;k<=end;k++){
            ar[k] = temp[i];
            i+=1;
        }
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}