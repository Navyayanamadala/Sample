package countletters;

public class Countletters {
	String name;
	String name1;
	
	Countletters(String name,String name1)
	{
		
		this.name=name;
		this.name1=name1;
	}
	void countDigits() {
		if(name.length()<name1.length()) {
			
		System.out.println(name1 + " is the largest");
		System.out.println( name1 + " is " + (name1.length()-name.length()) + " characters greater than " + name);
		}
		else if(name.length()==name1.length()) {
		System.out.println("both are equal");
		}
		else {
			
		System.out.println(name + " is the largest");
		System.out.println( name + " is " + (name.length()-name1.length()) + " characters greater than " + name1);
		}
		}
}













	/*void countDigits()
	{
		
		int count=0;
		for (int charIndex=0; charIndex<name.length();charIndex++)
			count++;
		
		
		System.out.println("number of charecters in given name = " + name + '\n'+"total name length " +count);
		
	    }*/





