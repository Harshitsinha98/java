import java.util.*;
class Grade{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Score to check your division : ");
		int a = sc.nextInt();
		if (a==90)
			System.out.println("Your score first division with honors");
		else if (a>=65)
			System.out.println("Your score first division ");
		else if (a>=40)
			System.out.println("Your score second division ");
		else if (a>=23)
			System.out.println("Your score third division division ");
		else
			System.out.println("You failed this assesment ");
	}
		//System.out.println("Thanks for using division checker");//
}