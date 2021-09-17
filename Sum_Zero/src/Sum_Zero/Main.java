package Sum_Zero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] userInputs = {-1,0,1,2,-1,4};
        Sum_Zero SZ = new Sum_Zero();
        List output = new ArrayList();
        output = SZ.Sum_Zero(userInputs);
        System.out.println("The output results will be: "+ output);
    }
}
