package epam.com.CollectionList;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        CollectionList<Integer> list=new CollectionList<Integer>();
   	 
   	 //Add elements
   	 list.add(1);
   	 list.add(2);
   	 list.add(3);
   	list.add(4);
  	 list.add(5);
  	 list.add(6);
  	list.add(7);
  	 list.add(8);
  	 list.add(9);
  	 list.add(10);
  	 
  	
  	    	System.out.println("Initial list");
  	        System.out.println(list);
  	        int cho=1;
  	        while(cho == 1) {
  	        	System.out.println("\n*** list Operations ***");
  	            System.out.println("\n1.Add 2.Remove 3.fetch 4.Print list");
  	            System.out.println("Enter your choice");
  	        	int ch = s.nextInt();
  		        switch(ch) {
  		        case 1:
  		        	System.out.println("Enter a number to add");
  		        	int n=s.nextInt();
  		        	list.add(n);
  		        	break;
  		        case 2:
  		        	System.out.println("Enter a index to remove");
  		        	int index=s.nextInt();
  		        	System.out.println(list.remove(index));
  		        	break;
  		        case 3:
  		        	System.out.println("Enter a index to get a value");
  		        	int ind=s.nextInt();
  		        	System.out.println(list.get(ind));
  		        	break;
  		        case 4:
  		        	System.out.println(list);
  		        	break;
  		        default:
  		        	System.out.println("enter a valid operation...!\n");
  		        	break;
  		        }
  		        System.out.println("\nDo you want to continue(1/2):");
  		        System.out.println("1.Yes\n2.No");
  		        int cn1 = s.nextInt();
  		        cho=cn1;
  	        }

    }
}
