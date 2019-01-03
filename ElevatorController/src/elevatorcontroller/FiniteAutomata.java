/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevatorcontroller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hp
 */
public class FiniteAutomata {

    int States = 6;
    String[] validChars = {"00", "01", "10", "11", "20", "21"};
    int[][] TranTable = {{0, 1, 0, 3, 0, 5},
                         {0, 1, 1, 1, 1, 1},
                         {2, 1, 2, 3, 2, 5},
                         {3, 3, 2, 3, 3, 3},
                         {4, 1, 4, 3, 4, 5},
                         {5, 5, 5, 5, 4, 5},};
    int InitState = 0;
    int[] FinalStates = {1, 3, 5};

    public FiniteAutomata() {
    }

//    boolean validate(int CS) {
//        for (int i = 0; i < FinalStates.length; i++) {
//            if (CS == FinalStates[i]) {
//                return true;
//            }
//        }
//        return false;
//    }

    int transition(int CS,String inputChars) {
        int pos = 0;
        for (int i = 0; i < validChars.length; i++) {
            Pattern p = Pattern.compile(validChars[i]);
            Matcher m = p.matcher(inputChars);
            if (m.matches()) {
                pos = i;
                break;
            }
        }
        return TranTable[CS][pos];
    }
}
