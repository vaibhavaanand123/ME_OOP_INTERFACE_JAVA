package pl_java.interface_.exercise_3.rule;

import java.util.Arrays;

public class MultiplicationRule implements GameRule {

    //TODO
    // This rule multiplies all the items in the input array and returns the final result.
   
   public int calculateResult(int[] input) {
        int mult=1;
        for(int each:input){
            mult*=each;
        }
        return mult;
    }

     public String toString() {
		return "MultiplicationRule"; 
	}
}
