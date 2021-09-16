package Sum_Zero;

import java.util.*;

public class Sum_Zero {
    public List<List<Integer>> Sum_Zero(int[] userInputs){

        Arrays.sort(userInputs);
        Set<List<Integer>> output = new HashSet<>();

        if(userInputs.length==0 || userInputs.length==1 || userInputs==2){
            System.out.println("There would need more input values from the user.");
            return Collections.emptyList();
        }

        for(int fixed=0; fixed<userInputs.length; fixed++){
            int smallest = fixed+1;
            int largest = userInputs.length-1;
            int sum_two = -userInputs[fixed];

            while(smallest<largest){
                if(userInputs[largest]+userInputs[smallest]==sum_two){
                    output.add(Arrays.asList(userInputs[fixed],userInputs[smallest],userInputs[largest]));
                    largest = largest -1;
                    smallest = smallest + 1;
                }
                if(userInputs[smallest]+userInputs[largest]<sum_two){
                    smallest = smallest + 1;
                }
                if(userInputs[smallest]+userInputs[largest]>sum_two){
                    largest = largest -1;
                }
            }

        }
        return new ArrayList(output);
    }
}
