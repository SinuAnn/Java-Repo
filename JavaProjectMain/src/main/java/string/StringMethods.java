package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello";
String b="Hhis is java program";//contains
String c="Hello";
System.out.println(a);
System.out.println(a.charAt(1));//print single char
System.out.println(a.length());//print length of the char
System.out.println(a.concat(" world"));
System.out.println(b.contains("This"));
System.out.println(c.equals(a));
System.out.println(c.equalsIgnoreCase(a));
System.out.println(c.compareTo(b));
	}

}
