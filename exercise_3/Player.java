package pl_java.interface_.exercise_3;

import pl_java.interface_.exercise_3.rule.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }
    
    //TODO
    // Implement this method
    // find the rule that produces the largest result.
    public GameRule findBest(GameRule[] rules){
        
        int best=0;
        GameRule bestRule=null;
        for(GameRule r: rules){
            int tempval=r.calculateResult(values);
            if(tempval>best){
                best=tempval;
                bestRule=r;
            }
        }
        return bestRule;
    }
}
