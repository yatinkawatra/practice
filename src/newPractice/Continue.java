package newPractice;

public class Continue {
	
	//continue is only used in loops, if we use continue it will skip that very operation and move to next one
	
	public static void main(String[] args)
	{
		for (int i= 0; i<5; i++)
		{
			if (i==3) //here 3 will not be printed
				continue;
			System.out.println(i);
		}
		
	}

}

class Contwhileloop
{
	public static void main(String[] args)
	{
		
	int i= 1;
	while (i<10)
	{
		if (i==3)
			continue;

		i++;

		System.out.println(i);
	}
	
	
	}
}
