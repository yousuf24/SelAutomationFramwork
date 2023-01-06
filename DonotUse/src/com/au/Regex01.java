package com.au;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) throws IOException {
		String input="#include<stdio.h>\r\n"
				+ "#include<stdlib.h>\r\n"
				+ "typedef struct Node\r\n"
				+ "{\r\n"
				+ "        int data;\r\n"
				+ "        struct Node *next;\r\n"
				+ "        struct Node *prev;\r\n"
				+ "}node;\r\n"
				+ "void insert(node *pointer, int data)\r\n"
				+ "{\r\n"
				+ "        /* Iterate through the list till we encounter the last node.*/\r\n"
				+ "        while(pointer->next!=NULL)\r\n"
				+ "        {\r\n"
				+ "                pointer = pointer -> next;\r\n"
				+ "        }\r\n"
				+ "        /* Allocate memory for the new node and put data in it.*/\r\n"
				+ "        pointer->next = (node *)malloc(sizeof(node));\r\n"
				+ "        (pointer->next)->prev = pointer;\r\n"
				+ "        pointer = pointer->next;\r\n"
				+ "        pointer->data = data;\r\n"
				+ "        pointer->next = NULL;\r\n"
				+ "}\r\n"
				+ "int find(node *pointer, int key)\r\n"
				+ "{\r\n"
				+ "        pointer =  pointer -> next; //First node is dummy node.\r\n"
				+ "        /* Iterate through the entire linked list and search for the key. */\r\n"
				+ "        while(pointer!=NULL)\r\n"
				+ "        {\r\n"
				+ "                if(pointer->data == key) //key is found.\r\n"
				+ "                {\r\n"
				+ "                        return 1;\r\n"
				+ "                }\r\n"
				+ "                pointer = pointer -> next;//Search in the next node.\r\n"
				+ "        }\r\n"
				+ "        /*Key is not found */\r\n"
				+ "        return 0;\r\n"
				+ "}\r\n"
				+ "void delete(node *pointer, int data)\r\n"
				+ "{\r\n"
				+ "        /* Go to the node for which the node next to it has to be deleted */\r\n"
				+ "        while(pointer->next!=NULL && (pointer->next)->data != data)\r\n"
				+ "        {\r\n"
				+ "                pointer = pointer -> next;\r\n"
				+ "        }\r\n"
				+ "        if(pointer->next==NULL)\r\n"
				+ "        {\r\n"
				+ "                printf(\"Element %d is not present in the list\\n\",data);\r\n"
				+ "                return;\r\n"
				+ "        }\r\n"
				+ "        /* Now pointer points to a node and the node next to it has to be removed */\r\n"
				+ "        node *temp;\r\n"
				+ "        temp = pointer -> next;\r\n"
				+ "        /*temp points to the node which has to be removed*/\r\n"
				+ "        pointer->next = temp->next;\r\n"
				+ "        temp->prev =  pointer;\r\n"
				+ "        /*We removed the node which is next to the pointer (which is also temp) */\r\n"
				+ "        free(temp);\r\n"
				+ "        /* Beacuse we deleted the node, we no longer require the memory used for it .\r\n"
				+ "           free() will deallocate the memory.\r\n"
				+ "         */\r\n"
				+ "        return;\r\n"
				+ "}\r\n"
				+ "void print(node *pointer)\r\n"
				+ "{\r\n"
				+ "        if(pointer==NULL)\r\n"
				+ "        {\r\n"
				+ "                return;\r\n"
				+ "        }\r\n"
				+ "        printf(\"%d \",pointer->data);\r\n"
				+ "        print(pointer->next);\r\n"
				+ "}\r\n"
				+ "int main()\r\n"
				+ "{\r\n"
				+ "        /* start always points to the first node of the linked list.\r\n"
				+ "           temp is used to point to the last node of the linked list.*/\r\n"
				+ "        node *start,*temp;\r\n"
				+ "        start = (node *)malloc(sizeof(node));\r\n"
				+ "        temp = start;\r\n"
				+ "        temp -> next = NULL;\r\n"
				+ "        temp -> prev = NULL;\r\n"
				+ "        /* Here in this code, we take the first node as a dummy node.\r\n"
				+ "           The first node does not contain data, but it used because to avoid handling special cases\r\n"
				+ "           in insert and delete functions.\r\n"
				+ "         */\r\n"
				+ "        printf(\"1. Insert\\n\");\r\n"
				+ "        printf(\"2. Delete\\n\");\r\n"
				+ "        printf(\"3. Print\\n\");\r\n"
				+ "        printf(\"4. Find\\n\");\r\n"
				+ "        while(1)\r\n"
				+ "        {\r\n"
				+ "                int query;\r\n"
				+ "                scanf(\"%d\",&query);\r\n"
				+ "                if(query==1)\r\n"
				+ "                {\r\n"
				+ "                        int data;\r\n"
				+ "                        scanf(\"%d\",&data);\r\n"
				+ "                        insert(start,data);\r\n"
				+ "                }\r\n"
				+ "                else if(query==2)\r\n"
				+ "                {\r\n"
				+ "                        int data;\r\n"
				+ "                        scanf(\"%d\",&data);\r\n"
				+ "                        delete(start,data);\r\n"
				+ "                }\r\n"
				+ "                else if(query==3)\r\n"
				+ "                {\r\n"
				+ "                        printf(\"The list is \");\r\n"
				+ "                        print(start->next);\r\n"
				+ "                        printf(\"\\n\");\r\n"
				+ "                }\r\n"
				+ "                else if(query==4)\r\n"
				+ "                {\r\n"
				+ "                        int data;\r\n"
				+ "                        scanf(\"%d\",&data);\r\n"
				+ "                        int status = find(start,data);\r\n"
				+ "                        if(status)\r\n"
				+ "                        {\r\n"
				+ "                                printf(\"Element Found\\n\");\r\n"
				+ "                        }\r\n"
				+ "                        else\r\n"
				+ "                        {\r\n"
				+ "                                printf(\"Element Not Found\\n\");\r\n"
				+ "\r\n"
				+ "                        }\r\n"
				+ "                }\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "}";
		String regex="(?://.*)|(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)"; /** **/  /*          */
		// (?://.*)|(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)
		//System.out.println(input.matches(regex));
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*Scanner s=new Scanner(System.in);
        String testString="";
        while(s.hasNext()){
            testString+=s.nextLine();
            testString+="\r\n";
        }
        s.close();*/
				
		
        Matcher m=Pattern.compile(regex).matcher(input);
        while(m.find()){
            System.out.println(m.group().replaceAll("^\\s+", ""));
        }

	}

}
