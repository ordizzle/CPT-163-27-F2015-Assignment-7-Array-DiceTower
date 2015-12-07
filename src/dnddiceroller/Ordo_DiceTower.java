/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordo_dicetower;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zacharyzordo
 */
public class Ordo_DiceTower {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        boolean d6Pass = true;
        boolean towerPass = true;
	for(int i = 0; i< 1000; i++){
            int d6 = test_oneD6();
            if(d6 != -1){
		System.out.println("Die Test Failed with Value: " + d6);
                d6Pass = false;
            }
            int tower = test_diceTowerWithTwoD6();
            if(tower != -1){
                System.out.println("Tower Test Failed with Value: " + tower);
                towerPass = false;
            }   
        }
        if(d6Pass){
            System.out.println("Die Test Passed");
        }
        if(towerPass){
            System.out.println("Tower Test Passed");
        }
    }
  
    public static int test_oneD6(){
	Die die = new Die(6);
	die.roll();
	int dieValue = die.getDieValue();
	if(dieValue >= 1 && dieValue <= 6){
            return -1; // Means the die value is outside its bounds for a d6
	}else{
            return dieValue;
	}
    }
  
    public static int test_diceTowerWithTwoD6(){
	List<Die> dice = new ArrayList();
	dice.add(new Die(6));
	dice.add(new Die(6));
	DiceTower tower = new DiceTower(dice);
	tower.whatAreTheDiceValues();
	int trayValue = tower.trayValue();
	if(trayValue >= 2 && trayValue <= 12){
            return -1; // means the die value is outside the bounds of 2 d6
	}else{
            return trayValue;
	}
    }
}

//    public static void main(String[] args) {
//        // TODO code ap
//        Die[] diceInTheTower = new Die[32]; // Create a tower of 32 dice.
//        for(int i = 0; i < diceInTheTower.length; i++){
//            diceInTheTower[i] = new Die();
//        }
//        DiceTower myDiceTower = new DiceTower(diceInTheTower);
//        
//        
//        myDiceTower.whatAreTheDiceValues();
//        //Die mySingleRoll = new Die(6);
//        //System.out.println(mySingleRoll.getDieValue());
//    }
//    
//    public static void roll(DiceTower[] diceToBeRolled){
//        for(int i = 0; i < diceToBeRolled.length; i++) {
//            
//        }
//    }
//}
