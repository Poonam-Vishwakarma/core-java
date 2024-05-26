package marks;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the English Marks in % : ");
		int english=sc.nextInt();
		
		System.out.print("Enter the Maths Marks in % : ");
		int maths=sc.nextInt();
		
		System.out.print("Enter the Science Marks in % : ");
		int science=sc.nextInt();
		
		if(english>=80 && science>=80 && maths>=80)
		{
		System.out.print("this candidate allocate pure science");
		}
		
		else if(english>=80 && science>=80 && maths>=60)
		{
			System.out.print("this candidate allocate bio.science");
		}
			
			else if(english>=60 && science>=60 && maths>=60)
			{
				System.out.print("this candidate allocate commerce");
				}

				else 
				{
					System.out.print("this candidate cannot allocate stream");
					}


		
	}

}
