package com.proj;
import java.util.ArrayList;
import java.util.Iterator;
public class Proj {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
al.add(13);
al.add(19);
al.add(11);
al.add(15);


System.out.println(al);
System.out.println();
System.out.println();

for(int i:al) {
System.out.println(i);
}
System.out.println();
System.out.println();
Iterator ii=al.iterator();
while(ii.hasNext()) {
	System.out.println(ii.next());
}
	}}
