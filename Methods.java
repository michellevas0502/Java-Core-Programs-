package projetc1;

public class Methods {
	public static void main(String args[]) {
		String name = "Michelle";
		int value = name.length();
		System.out.println(value);
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		String ustring = name.toUpperCase();
		System.out.println(ustring);
		String nTrimString = "  Miche  lle";
		System.out.println(nTrimString);
		String trimString = nTrimString.trim();
		System.out.println(trimString);
		String str = nTrimString.replaceAll("\s","");
		System.out.println(str);
		System.out.println(name.substring(1,5));
		System.out.println(name.replace('M','p'));
		System.out.println(name.replace("M","xyz"));
		System.out.println(name.startsWith("Mi"));
		System.out.println(name.endsWith("le"));
		System.out.println(name.charAt(3));
		
		String modifiedName = "Miicheellee";
		System.out.println(modifiedName.indexOf("ich"));
		System.out.println(modifiedName.indexOf("h"));
		System.out.println(modifiedName.lastIndexOf("llee"));
		String name1 = "michelle vas";
		System.out.println(name1.replace("", " "));
		
		String myStr = "Hello";
		byte[] result = myStr.getBytes();
		System.out.println(result[1]);
		
		String myStr3 = "Michelle";
		String myStr4 = "Michellee";
		if(myStr3.equals(myStr4)) {
			System.out.println("Equal Variables: ");
			System.out.println(myStr3.hashCode() + "\n" + myStr4.hashCode());
		}
		else {
			System.out.println("Not Equal");
			System.out.println(myStr3.hashCode() + "\n" + myStr4.hashCode());
		}
		
		String myStr5 = "Hello, Aims Institute. ";
		System.out.println(myStr5.indexOf("Aims"));
		
		String myName1 = "Hello";
		String myName2 = "";
		System.out.println(myName1.isEmpty());
		System.out.println(myName2.isEmpty());
		
		String a1 = String.join(",", "hello", "world");
		System.out.println(a1);
		
		String[] s1 = {"komal" , "neha"};
		String s2 = String.join(",", s1);
		System.out.println(s2);
	}

}
