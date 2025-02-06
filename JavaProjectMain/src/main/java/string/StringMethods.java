package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello";
String b="This is java program";//contains
String c="Hello";
System.out.println(a);
System.out.println(a.charAt(1));//print single char
System.out.println("length-"+a.length());//print length of the char
System.out.println("concat- "+a.concat(" world"));
System.out.println("contains- "+b.contains("This"));
System.out.println("equals- "+c.equals(a));
System.out.println("equals ignore- "+c.equalsIgnoreCase(a));
System.out.println("compare to- "+c.compareTo(b));
	}

}
