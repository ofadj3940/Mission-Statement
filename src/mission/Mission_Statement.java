/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mission;

/**
 *
 * @author Adjei-Afriyie
 */
public class Mission_Statement {
   private String name, purpose, process, accomplishments; 
   private int year1, year2, average; 
    
    public Mission_Statement(String n,String p,String pc,String a, int yr1, int yr2, int avg){
        n = name;
        p = purpose;
        pc = process;
        a = accomplishments;
        
        yr1 = year1;
        yr2 = year2;
        avg = average;
    }
          public String toString(){
              String output;
              
              output = "As I continue to grow and learn as a "+purpose+" student, ";
              output+= "I have a duty to put all my retained knowledge to good use in the world.";
                      output+= " In order to be able stay true to my purpose,";
                      output+= " I must first understand how to apply my knowledge of "+purpose;
                      output+= "in the real world. Then, and only then,";
                      output+= " I will make a conscious effort to look";
                      output+= " for opportunities to "+process;
                      output+= " I will know I am successful in reaching";
                      output+= " my goal when I have used my knowledge of "+purpose;
                      output+= " to graduate high school by "+year2+"and have been accepted to" + accomplishments;
                      output+= "with an average of "+average+". Ultimately, my goal is to let my knowledge guide me ";
                      output+= "through university to in turn, land myself a long term,";
                      output+= " yet enjoyable career as a(n) "+accomplishments+"before the year of "+year2+". ";
              return output;
          }  
}
