package com.tcs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
	}
}
public class Day31 {//custom linkedList
	Node head;
	
	public void display() {
		Node pointer=head;
		while(pointer!=null) {
			System.out.print(pointer.data+"->");
			pointer=pointer.next;//i++;
		}		
		
	}
	public void deleteBackHalf() {
		Node fast=head;
		Node slow=head;
		Node prev=null;
		
		while(fast!=null && fast.next!=null) {
			
			
			fast=fast.next.next;//i=i+2;
			prev=slow;
			slow=slow.next;//i++
		}prev.next=null;;
		
	}
	public void deleteFromEnd(int k) {
		Node p1=head;
		Node p2=head;
		for(int i=1;i<=k;i++) {
			p2=p2.next;
			if(p2.next==null) {
				if(i==k)head=head.next;
				return;
			}
			
		}
		while(p2!=null) {
			p1=p1.next;
			p2=p2.next;//when p2 reaches end , p1 should have reached kth position from start
		}
		p1.next=p1.next.next;
	}
	public static String reverse(String s) {
		 return new StringBuilder(s).reverse().toString();
	}


	public static void main(String[] args) {
		
		Day31 customLinkedList=new Day31();
		
		customLinkedList.head=new Node(24);
		
		Node two=new Node(20);
		Node three=new Node(18);
		Node four=new Node(16);
		Node five=new Node(17);
		
		customLinkedList.head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		customLinkedList.display();
		customLinkedList.deleteBackHalf();
		System.out.println();
		customLinkedList.display();
		
		//How to iterate through the linkedList
		
		LinkedList<Integer> ll=new LinkedList<>();
		Queue<Integer> Qu=new LinkedList<>();
		//FIFO .add .offer .remove .poll
		
		
		
		
		
		
		
		//Revise reverse a string first and then go for reversing an sentence
		//LinkedList (Node class, display(), deleteFromEnd(),deleteFromSt(),deletBackHalf()) , Queue as LinkedList
		//TODO: To raji when a class implements comparable interface
		
		
//		String nm1="Kungfu panda";
//		StringBuilder sb=new StringBuilder(nm1);//sb.toString();//sb.reverse();
//		System.out.println(sb.reverse());
		
		/*String sent="my name is joey tribianni and iam dim witted";
		StringBuilder sb2=new StringBuilder();
		String arr[]=sent.split(" ");
		
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(i!=len-1) {				
				sb2.append(reverse(arr[i])).append(" ");	
			}
			else sb2.append(reverse(arr[i]));
		}
		System.out.println(sb2.toString());*/

	}

}
