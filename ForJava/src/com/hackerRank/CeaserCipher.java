package com.hackerRank;

public class CeaserCipher {
	static void addNumtoChar(char c,int n) {
		System.out.println((char)(c+n));
	}

	public static void main(String[] args) {
		addNumtoChar('d', 5);
		String s="Z"
				+ "";
		 char[] arr=s.toCharArray();int len=s.length(),k=3;
		    for(int i=0;i<len;i++){
		    	if((arr[i]>='a'&& arr[i]<='z') && k>=0)
		        arr[i]= (char)((arr[i]-'a' + k)%26 +'a');
		    	else if((arr[i]>='A' && arr[i]<='Z') && k>=0) {
		    		arr[i]=(char)((arr[i]-'A' + k)%26 +'A');
		    	}
		    	else if((arr[i]>='a'&& arr[i]<='z') && k<0)
		    		arr[i]=(char)((arr[i]-'a' + k+26)%26 +'a');
		    	else if((arr[i]>='A' && arr[i]<='Z') && k<0) {
		    		arr[i]=(char)((arr[i]-'A' + k+26)%26 +'A');
		    	}
		    }
		    //System.out.println(new String(arr));

	}

}
