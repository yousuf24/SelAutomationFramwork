package com.codility;

public class LongestBinarySeq {
	public static int solution(int N) {
		String bs=Integer.toBinaryString(N);
		System.out.println(bs);
		int len=bs.length(),gmax=0;
		int i=0;
		while (i < len) {
			
			if (bs.charAt(i) == '1') {// possible scenario
				int lmax = 0;
				int j = i+1;
				//System.out.println(j);
				while (j<len) {
					 if (bs.charAt(j) == '1') {
						lmax = j - (i+1);break;						
					}else {j++;}
				}
				System.out.println(lmax);
				gmax = Math.max(gmax, lmax);
				i=Math.max(j, i);
			}i++;
			
		}return gmax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(75826520));//10000010001 = 1041

	}

}
