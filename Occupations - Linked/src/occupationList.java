/* occupationList.java
this class contains methods to search the linked list, print data, and make calculations
last edited 6/14/23 by Lavdrim Islami
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class occupationList {
    private linkedList occupations; //attribute of occupationlist
    public occupationList(){
      occupations = new linkedList(); //instantiates linked list object
    }
    public void readFileInserts(String fileName) throws FileNotFoundException { //reads the data for the text file
        //create file object
        File OccupationList = new File("occupations.txt");

        //create new scanner object
        Scanner OC = new Scanner(OccupationList);

        //read the data and values, remove the commas from the values
        while (OC.hasNextLine()) {//begin while
            String inCos = OC.nextLine();
            String inTitle = OC.nextLine();
            int inEmployed = Integer.parseInt(OC.nextLine().replace(",", ""));
            float inSalary = Integer.parseInt(OC.nextLine().replace(",", ""));

            Occupation occupation = new Occupation(inCos, inTitle, inEmployed, inSalary);
            occupations.append(occupation);
        }//end while
    }//end readfileinserts

    public String SearchList (String newCOS) {//begin searchlist
        String searchOutput = "";
        boolean Found = false;
        ListNode current = occupations.getHead();
        //for loop to search through the list and find the COS
        for (int i = 0; i < occupations.getSize(); i++) {//begin for
            String foundCOS = current.getData().getCOS();
            if (foundCOS.equals(newCOS)) {//if statement for if the cos equals one on the list
                String index = Integer.toString(i);
                String object = current.getData().toString();
                searchOutput = ("The occupation with cos " + newCOS + " was found at index " + index + " and contains: \n" + object);
                Found = true;

            }//end if

            current = current.getNext();

        }//end for
        if (!Found){
            //if cos doesn't match
            searchOutput = ("The occupation with cos " + newCOS + "Cannot be found");
        }//end if
        return searchOutput;
    }//end searchlist


    public void printData(){ //loop to print list
        ListNode current = occupations.getHead(); //sets the point of the linked list to the initial node
        for (int i = 0; i<occupations.getSize(); i++){
            System.out.println(current.getData().toString());
            current.getNext(); //setting current point to next node
        }
    }//end printdata
    //method to calculate and return total number of people employed
    public int totalEmp (){
        int total = 0;
        ListNode current = occupations.getHead();
        //loop to go through the list and add all the numbers for amount employed
        for(int i = 0; i < occupations.getSize(); i++) { //begin for
            int thisEmp = current.getData().getEmployedNum();
            total += thisEmp;

            current = current.getNext();
        } //end for
        return total; //method was originally tested with only 10 total occupations and manually checked, in that case the method correctly totalled it up so it can be assumed that it did it
        //correctly with the entire list
    } //end totalemp

    //method to calculate and return the average salaries across all occupations
    public int salaryAvg (){
        int salTotal = 0;
        ListNode current = occupations.getHead();
        //loop to go through the list and add the salary
        for(int i = 0; i < occupations.getSize(); i++) {//begin for
            float thisSalary = current.getData().getAnnualWage();
            salTotal += thisSalary;
            current = current.getNext();
        }//end for
        //divides total salary by the count of items in the list
        salTotal = salTotal / occupations.getSize();
        return salTotal;
    }//end salaryAvg


}
