/* Occupations.java
This file contains the executable class for the project and instantiates the occupation object
last edited 6/14/23 by Lavdrim Islami
*/
//import libraries
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {//begin main
    //begin main method
    public static void main(String[] args) throws FileNotFoundException{
        occupationList arrayofOccupation = new occupationList();
        arrayofOccupation.readFileInserts("occupations.txt");
        System.out.println("Please enter the number for the action you would like to perform\n" + "1.Print entire list\n2.Print total number of people employed across all occupations\n"
                + "3.Print the average of all the average salaries\n" + "4.Search the data for one occupation by its COS code\n" + "5.Exit the program\n" +"--------------------------------" );

        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();
        Scanner userRequest = new Scanner(System.in);

        if (userChoice.equals("1")){  //if 1, print the array
            arrayofOccupation.printData();
        } else if (userChoice.equals("2")) {//if 2, print total employed   /////
            System.out.println("The total amount of people employed is: " + arrayofOccupation.totalEmp() + "\n");
        } else if (userChoice.equals("3")) { //if 3, print average of all salaries   /////
            System.out.println("Average salary across all occupations is: " + "$" + arrayofOccupation.salaryAvg());
        } else if (userChoice.equals("4")) { //if 4, search program for one occupation with code
            System.out.println("Enter a specific COS code to search for:" + "\n");
            String userCOS = userRequest.nextLine();
            System.out.println(arrayofOccupation.SearchList(userCOS));  //print the search results
        } else if (userChoice.equals("5")) { //else if 5 then program exits
            System.exit(0);
        }


    }//end main method

}//end main class