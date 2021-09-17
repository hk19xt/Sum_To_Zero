package Sum_Zero;

import java.util.ArrayList;
import java.util.List;
/* This class is the main class. The users can change the input values in the hardcoded lines.
   After compiling the program, the output arrays will be shown in the console.
   Author: Hyejin Kim
   Date: 9/17/2021
*/
public class Main {
    public static void main(String[] args){
        Sum_Zero SZ = new Sum_Zero();
        List output = new ArrayList(); 
        int[] userInputs = {-3,0,2,1,1,-2}; // Users can change the input values here.
   
        output = SZ.Sum_Zero(userInputs);
        System.out.println("The output results will be: "+ output);
    }
}// Main
