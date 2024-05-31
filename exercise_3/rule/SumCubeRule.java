package pl_java.interface_.exercise_3.rule;

public class SumCubeRule implements GameRule {

    public int calculateResult(int[] input){
        int cube=0;
        for(int each:input){
            cube+=(each*each*each);
        }
        return cube;
    }

    public String toString(){
        return "SumCubeRule";
    }
    
}
