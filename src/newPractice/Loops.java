package newPractice;

public class Loops {

	// int i = 5; we can not declare int outside main method and use it inside main method because main method
	//is static and we are declaring instance variable so we have to declare it as static
	public static void main(String args[])
	{
	 int i = 5;
		while (i<10)
		{
			System.out.println("hello world");
			i++;
		}
	}


}

class dowhile
{
	// int i = 2;
	public static void main(String[] args)
	{
	int i = 2;
	do {
		System.out.println("hello world");
		i++;
		
	}
	while (i<2);
}
}

class forloop
{
	public static void main(String[] args)
	{
		for (int i = 0; i<4; i++)
		{
			for (int j= 0; j<i; j++)
			{
				System.out.println("$ ");
				break;
			}
		}
	}
}