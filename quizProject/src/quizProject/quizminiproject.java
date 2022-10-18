
	package quizProject;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	
	public class quizminiproject
	{

		public static void main(String args[]) throws ClassNotFoundException, SQLException
			
		
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection( "jdbc:mysql://localhost:3306/quizproject", "root","root");
		  System.out.println("\n*******Enter any one number to select option*******");
			System.out.println("\n\t\t1.Register\n\t\t2.Login\n\t\t3.View Marks List\n\t\t4.Exit");
		    Scanner s=new Scanner(System.in);
		 int input=s.nextInt();
		
		  Statement s1=c.createStatement();
		  String answer="";
		  int correctanswer=0;
		  int questings=10;
		 switch(input)  
		 {
		 
		 case 1:
		      System.out.println("Enter Email ID");
		      String email=s.next();
		      System.out.println("Enter your name");
		      String name=s.next();
		      System.out.println("Enter Last name");
		      String Lname=s.next();
		      System.out.println("Enter password");
		      String password=s.next();
		      s1.executeUpdate( "INSERT INTO register values('"+email+"','"+name+"','"+Lname+"','"+password+"')");
		      System.out.println("Confirm password");
		       String  confirm=s.next();
		       int password1=password.length();
		       int password2=confirm.length();
		       if(password1 != password2)
		       {
		    	  
		    	   System.out.println("password mismatch enter password again");
				   String p1=s.next();
				  System.out.println("********Register successfully********\n****Best Luck For Your Quiz****\nEnter login to Procced quiz ");
				  input=s.nextInt();
		       }
		        else {
		    	   for(int i=0; i<password1;i++)
		    	  {
		    		   if(password.charAt(i) !=confirm.charAt(i))
		    		   {
		    			   System.out.println("password mismatch enter password again");
		    			   String p2=s.next();
		     		  }
		     	   }
		    	  
		    	   System.out.println("********Register successfully********\n****Best Luck For Your Quiz****\nEnter 2 login to Procced quiz ");
	 			  input=s.nextInt();
	 	     
		    
		    }
		 
		 case 2:
		 {

			 
			       System.out.println("enter user name");
			       name=s.next();
			       System.out.println("enter password");
			       String pwd=s.next();
			    	  System.out.println("*****Login Successfully*****\n*** Best Luck ***");
			          System.out.println("\n*****Start Quiz*****");
			    
		      ///////////////////////////////////////////////////////////////Questions 1
			      System.out.println("\nQ.1.Which of the following is not a Java features?\n");
		      System.out.println("1:Dyanamic");
		      System.out.println("2:Use of Pointers");
		      System.out.println("3:Architectural Neutral");
		      System.out.println("4:Object -oriented");
		      answer=s.next();
		      if(answer.equals("2"))
		      {	  correctanswer=correctanswer+1;
		      }
		      ///////////////////////Questions 2
			      System.out.println("\nQ.2.An interface with no fields or methods is known as a ______\n");
		      System.out.println("1:Runnable Interface");
		      System.out.println("2:Marker Interface");
		      System.out.println("3:Abstract Interface");
		      System.out.println("4:CharSequence Interface");
			      answer=s.next();
		      if(answer.equals("2"))
		      {
		    	  System.out.println("Good");
		    		    	  correctanswer=correctanswer+1;
		      }
		      else
		      {
		    	  System.out.println("incorrect");
		      }
		     
		    //question 3 
		      System.out.println("\nQ.3.Who invented Java Programming?\n");
		      System.out.println("1:Guido van Rossum");
		      System.out.println("2:James Gosling");
		      System.out.println("3:Dennis Ritchie");
		      System.out.println("4:Bjarne Stroustrup");
		      
		      answer=s.next();
		      if(answer.equals("2"))
		      {
		    		  correctanswer=correctanswer+1;
		      }
		    //question 4
		      System.out.println("\nQ.4.Which statement is true about Java?");
		      System.out.println("1:Java is a sequence-dependent programming language");
		      System.out.println("2:Java is a code dependent programming language");
		      System.out.println("3:Java is a platform-dependent programming language");
		      System.out.println("4:Java is a platform-independent programming language");
		      
		      answer=s.next();
		      if(answer.equals("4"))
		      {
		    	    	  correctanswer=correctanswer+1;
		      }
		    //question 5
		      System.out.println("\nQ.5.Which component is used to compile, debug and execute the java programs?");
		      System.out.println("1:JRE");
		      System.out.println("2:JIT");
		      System.out.println("3:JDK");
		      System.out.println("4:JVM");
		   
		      answer=s.next();
		      if(answer.equals("3"))
		      {
		  	  correctanswer=correctanswer+1;
		      }
		    //question 6
				System.out.println("\n Q.6.Select the valid statement to declare and initialize an array?\n");
				System.out.println("1:int[]A={}");
				System.out.println("2:int[]A=(1,2,3,4");
				System.out.println("3:int[]A={1,2,3,4}");
				System.out.println("4:int[]A={1 2 3 }");
				
				answer=s.next();
				if (answer.equals("3"))
				{
					correctanswer=correctanswer+1;
				}
		//question 7
				System.out.println("\n Q.7.Array in java are?\n");
				System.out.println("1:Object referneces");
				System.out.println("2:objects");
				System.out.println("3:Primitive data type");
				System.out.println("4:None");
				
				answer=s.next();
				if (answer.equals("2"))
				{
					correctanswer=correctanswer+1;
				}
		//question 8
				System.out.println("\n Q.8.When is the object created with new keyword?\n");
				System.out.println("1:At run time");
				System.out.println("2:At compiletime");
				System.out.println("3:Depends on the code");
				System.out.println("4:None");
				
				answer=s.next();
				if (answer.equals("1"))
				{
					correctanswer=correctanswer+1;
				}
		//question 9
				System.out.println("\n Q.9.compareTo() returns?\n");
				System.out.println("1:True ");
				System.out.println("2:False");
				System.out.println("3:An int value");
				System.out.println("4:None");
				
				answer=s.next();
				if (answer.equals("3"))
				{
					correctanswer=correctanswer+1;
				}
		//question 10
				System.out.println("\n Q.10.In which of the following is toString() method defined?\n");
				System.out.println("1:java.lang.Object");
				System.out.println("2:java.lang.String");
				System.out.println("3:java.lang.util");
				System.out.println("4:None");
				
				answer=s.next();
				if (answer.equals("1"))
				{
					correctanswer=correctanswer+1;
				}
				
		       double grade=correctanswer/10.0 * 100.0;
		        s1.executeUpdate(" INSERT INTO Quiz VALUES('"+name+"', '"+pwd+"','"+grade+"')");
		       s1.close();
				
				if(grade>=80)
				{
				System.out.println("Congrats !!!!! your grade is A+....\n your score is :"+grade);
				}
				else if(grade<=70 && grade>=60)
				{
					System.out.println("Congrats !!!!! your grade is B+ ....\n your score is :"+grade);
				}
				else if(grade<=60 && grade>=40)
				{
					System.out.println("Congrats !!!!! your grade is C+ ....\n your score is :"+grade);
				}
				else if(grade<=40)
				{
					System.out.println("Ooops !!!!! your grade is C ....\n your score is :"+grade);
				}
				else
				{
					System.out.println("You are Fail...\nyour score is :"+grade);
				}

		//   System.out.println("enter any number to select option");
		 //  input=s.nextInt();
					
				break;
		    }
		 
		 case 3:
		 {
			 PreparedStatement p=c.prepareStatement("Select * from Quiz");
			 ResultSet rs=p.executeQuery();

			 while(rs.next()) {
				
				 System.out.println("\nUsername:"+rs.getString(1));
			 
				 System.out.println("Marks="+rs.getString(3));
				 
			 }
				 rs.close();
			 c.close();
			 p.close();
		
		 }
		 
			case 4:
		 {
		     	System.out.println("\n****Thank You****");
		        break; // exit the loop
		    }
		   default :
		    {
		        System.out.println(" invalid input, tell them to try again");
		    }
		

		}}}
