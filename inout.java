import java.util.Scanner;
class Inout
{
   static Scanner sc=new Scanner(System.in);
   static int num;
   public static void main(String[] args)
	   {
		CheckIn();
           }
    
   public static void CheckIn()
	   {
	    System.out.print("Enter the number of check in today: ");
	    int no=sc.nextInt();
            System.out.println("Checkins today: "+no);
            String[] Name=new String[no];
            String[] Day=new String[no];
            String[] Month=new String[no];
            int[] Year=new int[no];
            int[] totalIn=new int[no];
            System.out.println("Enter the details of all check ins name,day,month");
             for(int count=0;count<no;count++)
		{
System.out.println();
                  System.out.print("Enter the name: ");
                  Name[count]=sc.next();
System.out.println();
                  System.out.print("Enter the day: ");
                  Day[count]=sc.next();
System.out.println();
		  System.out.print("Enter the month: ");
                  Month[count]=sc.next();
System.out.println();
                  System.out.print("Enter the year: ");
                  Year[count]=sc.nextInt();
System.out.println();
                  num=count+1;
                  System.out.println("Token Number: "+num);
                  System.out.println("Name: " +Name[count]);
                  
                  System.out.println("Day: " +Day[count]);
                  System.out.println("Month: " +Month[count]);
		  System.out.println("Year: " +Year[count]);
           
		}
                //For loop of check in ends here.
             
	   }//method check ins ends here.
   public static void CheckOut()
           {
             
           }
}


























