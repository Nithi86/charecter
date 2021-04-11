package org.character;

public class CheckCharacter {
	public static void main(String[] args) {
		
String s1="Java";
String s2="Java";
boolean a = s1.equals(s2);
System.out.println(a);
String s3="Java";
String s4="java";
boolean b = s3.equals(s4);
System.out.println(b);
String s5="Green Technolagy";
String s6="GreenTechnolagy";
boolean c = s5.equals(s6);
System.out.println(c);
String s7="Java";
String s8="java";
boolean d = s7.equalsIgnoreCase(s8);
System.out.println(d);
String s9="Nisha";
String s10="nisha";
boolean e = s9.equalsIgnoreCase(s10);
System.out.println(e);

}
}