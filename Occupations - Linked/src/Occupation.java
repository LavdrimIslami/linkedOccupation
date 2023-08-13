/* Occupation.java
This file contains the declaration for Occupation class of objects
Last edited 6/1/23 by Lavdrim Islami
 */

public class Occupation { //begin class
    //properties
    private String COS;
    private String TitleChoose;
    private int EmployedNum;
    private float AnnualWage;

    //constructors
    //public Occupation(){

 //   }//end default constructor
    //constructor creates occupation
    public Occupation(String COS, String TitleChoose, int EmployedNum, float AnnualWage){
        this.COS = COS;
        this.TitleChoose = TitleChoose;
        this.EmployedNum = EmployedNum;
        this.AnnualWage = AnnualWage;

    } //end constructor

    //accessors
    public String getCOS(){return COS;}
    public String getTitleChoose(){return TitleChoose;}
    public int getEmployedNum(){return EmployedNum;}
    public float getAnnualWage(){return AnnualWage;}

    //mutators
    public void setCOS(String OccupationCode){this.COS = OccupationCode;}
    public void setTitleChoose(String TitleChoose){this.TitleChoose = TitleChoose;}
    public void setEmployedNum(int EmployedNum){this.EmployedNum = EmployedNum;}
    public void setAnnualWage(float AnnualWage){this.AnnualWage = AnnualWage;}

    //toString method that returns info about an occupation
    public String toString(){
        return("COS: " + COS + "\nTitle: " + TitleChoose + "\nNumber Employed: " + EmployedNum + "\nAnnual Wage: $" + AnnualWage );
    }//end toString



}//end occupation class
