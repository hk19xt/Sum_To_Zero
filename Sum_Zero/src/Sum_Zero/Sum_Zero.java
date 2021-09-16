package Sum_Zero;

import java.util.*;

/*This class is the implementation class for the output zero from the sum of the three elements in the array.
  The user input values will be inserted by the main class.
  The implementation will use the binary search in order to find the new array and three elements whose sum becomes zero.
*/

public class Sum_Zero {
    
    public List<List<Integer>> Sum_Zero(int[] userInputs){

        Arrays.sort(userInputs); //Before the binary search, we need to sort the input array.
        Set<List<Integer>> output = new HashSet<>(); //Initialize the new set for storing the new output arrays.

        if(userInputs.length==0 || userInputs.length==1 || userInputs==2){ //If the length is less than three, then more input values will be needed.
            System.out.println("There would need more input values from the user.");
            return Collections.emptyList();
        }

        //In order to find the sum zero array, we need to consider three cases in total.
        for(int fixed=0; fixed<userInputs.length; fixed++){
            int smallest = fixed+1;
            int largest = userInputs.length-1;
            int sum_two = -userInputs[fixed];

            while(smallest<largest){
                if(userInputs[largest]+userInputs[smallest]==sum_two){ //case 1: when the output meets the sum of zero from the three elements,
                    output.add(Arrays.asList(userInputs[fixed],userInputs[smallest],userInputs[largest])); // then we add this array to the new set to store our results.
                    largest = largest -1;
                    smallest = smallest + 1;
                }
                if(userInputs[smallest]+userInputs[largest]<sum_two){ //case 2: 
                    smallest = smallest + 1;
                }
                if(userInputs[smallest]+userInputs[largest]>sum_two){ //case 3:
                    largest = largest -1;
                }
            }

        }
        return new ArrayList(output);
    }
}//Sum_Zero
