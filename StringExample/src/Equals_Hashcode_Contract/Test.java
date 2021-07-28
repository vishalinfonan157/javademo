package Equals_Hashcode_Contract;

public class Test {
	public static void main(String[] args) {
		
		
		Student s1= new Student();
		s1.setId(101);
		s1.setName("vishal");
		
		Student s2= new Student();
		s2.setId(101);
		s2.setName("vishal");
		
	
		
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());	
		
		System.out.println(s1==s2);
	}

}
