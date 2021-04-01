package newPractice;

public class SwitchAndBreak {
	
	public static void main(String[] args)
	{
		int age = 10;
		String category;
		switch (age)
		{
		case 1: 
			category = "new born";
			break;
			
		//case 1.0: duplicate case not allowed and type mismatch is not allowed we can not use float in case when int
			//is declared 
		//	category = "wewf";
			
			
		case 5:
			category = "child";
			break;
			
		case 10:
			category = "adult";
			break;
			
		default:
			category = "invalid age";
		}
		System.out.println("child is " + category);
	}

}

class Defaultinbetween
{
	public static void main(String[] args)
	{
		int marks = 100;
		String category;
		
		switch (marks)
		{
		case 10:
			category = "fail";
			
			
		case 40:
			category = "pass";
			
		default: 
			category = "paper ni dia";
			break;// we can use break in between cases as well but we have to use break else it will stuck in loop
			
		case 80:
			category = "first";
		}
		System.out.println("mark is "+ category);
	}
}

class Switchwithoutbreak
{
	public static void main(String[] args)
	{
		int b = 10;
		String cat;
		
		switch (b)
		{
		
		case 10:
			cat = "prev";
			break;
			
		case 2:
			cat = "new";
			
		case 5:
			cat = "old";
			
			default:
				cat = "def";
			
			
		}
		System.out.println(cat);
	}
}
