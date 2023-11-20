package array;

public class StringOperations {

	public static void main(String[] args) {
		
		//concat
		String s="Hello";
		String s1=" welcome to india";
		String s2="hello";
		System.out.println(s.concat(s1)); //Hellowelcome
		System.out.println(1+3+s+3+4);//4Hello34
		
		//contains
		
		System.out.println(s1.contains("el")); //true
		
		//equals
		
		System.out.println(s.equals(s1));//false
		System.out.println(s.equals(s2));//false  case sensitive
		System.out.println(s.equalsIgnoreCase(s2));//true not case sensitive
		
		//length
		
		System.out.println(s.length());//5
		
		//toUpperCase toLowerCase
		
		System.out.println(s.toUpperCase()); //HELLO
		System.out.println(s.toLowerCase());//hello
		
		//trim
		
		System.out.println(s.trim());//Hello
		
		//startsWith endsWith
		
		System.out.println(s.startsWith("H"));//true
		System.out.println(s.endsWith("o"));//true
		
		//substring
		
		System.out.println(s.substring(2,5));//llo
		
		//charAt
		
		System.out.println(s.charAt(0));//H
		
		//split
		String sr="Java_is_a_highlevel_language ";
		String array[]=sr.split("_");
		for(String sd:array)
		{
			System.out.println(sd);
		}
		
		//replace
		
		String we="Hei welcome";
		System.out.println(we.replace("Hei","Hello"));		
	
	}

}
