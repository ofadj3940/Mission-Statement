/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mission;
import java.util.Scanner;
/**
 *
 * @author Adjei-Afriyie
 */
public class Mission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String output;
        String uni = "";
        String exp = "";
        String pos = "";
        int avg = 0;
        
        
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = x.nextLine();
        
        System.out.println("What year do you wish to complete high school, "
              + name +"?");
        int year = y.nextInt();
        
        //System.out.println("Where do you hope to go after high school?");
        //String postSec = x.nextLine();
        
        
        System.out.println("Which of these fields of study are you potentially considering?/n(Computer Science, Chemistry, Health Science, Business, Mathematics)");
        String program = x.nextLine();
        
        System.out.println("When do you hope to have a stable career?");
        int secYr = y.nextInt();
        
        
        
        if (program.equalsIgnoreCase("Computer Science") || 
                program.equalsIgnoreCase("cs")){
            uni = "University of Toronto";
            exp = "tutor other students, create helpful programs, and develop intricate algorithms.";
            avg = 95;
            pos = "software developer, or computer science professor";
            
            //Mission_Statement version1 = new Mission_Statement(name, program, uni, exp, avg, year, secYr);
            //System.out.println(version1.toString());
        }else if (program.equalsIgnoreCase("Chemistry")){
            uni = "University of Toronto";
            exp = "tutor other students, as well as ";
            avg = 95;
            pos = "chemist, chemical engineer, or pharmacist";
            
        }else if (program.equalsIgnoreCase("Health Science")){
            uni = "McMaster University";
            exp = "tutor other students about health science and shadow various boilogists and/or doctors.";
            avg = 95;
            pos = "pediatrition or dietician";
            
        }else if (program.equalsIgnoreCase("Business")){
            uni = "University of Toronto";
            exp = "be an active leader within the school and will also take part in business oriented clubs.";
            avg = 95;
            pos = "successful entrepeneur or accountant";
            
        }else if (program.equalsIgnoreCase("Mathematics")){
            uni = "University of Waterloo";
            exp = "tutor other students and take part in math competitions.";
            avg = 90;
            pos = "mathematics professor";
            
        }else{
         output ="As I continue to grow and learn as a student, I have a duty to"
                 + "\nput all my retained knowledge to good use in the world. In "
                 + "\norder to be able stay true to my purpose, I must first"
                 + " \nunderstand how to apply my knowledge in the real world."
                 + "\nThen, and only then, I will make a conscious effort to look"
                 + "\nfor opportunities where I can put my skills to good use. I "
                 + "\nwill know I am successful in reaching my goal when I have "
                 + "\nused my knowledge of physical fitness, Mathematics, various "
                 + "\nlanguages, business leadership, and the sciences to graduate"
                 + "\nhigh school by June 2018. Ultimately, my goal is to let my "
                 + "\nknowledge guide me through university to in turn, land"
                 + "\nmyself a long term, yet enjoyable career before the year of 2029. ";  
         
         System.out.println("\n"+name+"'s Mission Statement:\n"+output);
        }
         output = "As I continue to grow and learn as a "+program+" student, ";
              output+= "\nI have a duty to put all my retained knowledge to good use in the world.";
                      output+= "\nIn order to be able stay true to my purpose,";
                      output+= "\nI must first understand how to apply my knowledge of "+program;
                      output+= "\nin the real world. Then, and only then,";
                      output+= "\nI will make a conscious effort to look";
                      output+= "\nfor opportunities to "+exp;
                      output+= "\nI will know I am successful in reaching";
                      output+= "\nmy goal when I have used my knowledge of "+program;
                      output+= "\nto graduate high school by "+year+" and have been accepted to " + uni;
                      output+= "\nwith an average of "+avg+"%. Ultimately, my goal is to let my knowledge guide me ";
                      output+= "\nthrough university to in turn, land myself a long term,";
                      output+= "\nyet enjoyable career as a(n) "+pos+" before the year of "+secYr+". ";
        
                      System.out.println("\n"+name+"'s Mission Statement:\n"+output);
        
        
        
    }
    
}
