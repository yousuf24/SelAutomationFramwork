package com.codility;

public class LongestBinarySeq {
	       static int maxZeros(int N)
    {
        int maxm = -1;
        
        String bs=Integer.toBinaryString(N);int len=bs.length();
        System.out.println(bs);
        for(int i=0;i<len;i++) {
        	if(bs.charAt(i)=='1') {
        		int cnt = 0;//make it zero when u hit '1' closing end
        		int j=i+1;
        		while(j<len) {
        			if(bs.charAt(j)=='1') {cnt=j-(i+1); break;}
        			else j++;
        		}maxm=Math.max(maxm, cnt);
        		i=Math.max(j-1, i);
        		//System.out.println(i);
        	}
        }
       

        return maxm;
    }
	public static int solution(int N) {
		String bs=Integer.toBinaryString(N);//0001000010000100000000001
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
					}else j++;
				}
				
				gmax = Math.max(gmax, lmax);
				i=Math.max(j-1, i);
			}i++;
			
		}return gmax;
	}
	public static void main(String[] args) {
		
		//System.out.println(solution(1098765));//100000100001 = 1041 -->0
		System.out.println(maxZeros(104197));// 10000000 -->6

	}

}
