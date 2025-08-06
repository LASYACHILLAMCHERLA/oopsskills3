package stringsexamples;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Nirmala";
		String s2 = "Nirmala";
		System.out.println(s1 == s2);
		s1 = s2 + "Jyothi";
		System.out.println(s1 ==s2);
		
		String s3 = "NirmalaJypthi";
		System.out.println(s1==s3);

	}

}
