import java.util.Scanner;
public class scanner{
   	public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter your name:");
         String name=scanner.next();
          scanner.nextLine();
	 System.out.println("Enter your college name:");
	 String college=scanner.nextLine();
	 System.out.println("Enter your roll number:");
          int rollnumber=scanner.nextInt();
	 System.out.println("enter your 1st year marks percentage:");
	 float marks=scanner.nextFloat();
	 scanner.close();
	 System.out.println("-------Your Details-------\n");
         System.out.println("Name:"+name);
	 System.out.println("\nollege:"+college);
	 System.out.println("\nRollno:"+rollnumber);
	 System.out.println("\nPercentage:"+marks);
	 }
}
                 
         
         