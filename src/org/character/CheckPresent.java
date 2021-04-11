package org.character;

public class CheckPresent {
public static void main(String[] args) {
	//5.1 In Email id to check @ is there or not
	System.out.println("5.1 In Email id to  check @ is there or not");
	
	String s1 ="velmurukank451@gmail.com";
	boolean a = s1.contains("@");
	System.out.println(a+ ":  Valid email Id" );
	
	//5.3 In Email id to check @ is there or not
	System.out.println("5.3 In Email id to  check @ is there or not");
	String s2="Nishakerala24@gmail.com";
	boolean b = s2.contains("@");
System.out.println(b);

    //5.2 In Address to check Pincode is there or not

System.out.println("5.1 In Address to check Pincode is there or not");

		String s3="5_35_2a, Venkatesh nivas, Aruppukottai";
	boolean c = s3.contains("pincode");
	System.out.println(c+" :  Invalid Address");
	
	//5.4  To check Phone No , any charecter is there or not
	
	System.out.println("5.4   To check Phone No , any charecter is there or not");
	
	String s4="90954a6o78";
	boolean d = s4.contains("ch");
	System.out.println(d+" :  Invalid Address");
	
	
	
}
}
