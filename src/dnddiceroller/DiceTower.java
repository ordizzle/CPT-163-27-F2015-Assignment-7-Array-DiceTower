/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordo_dicetower;

import java.util.List;

/**
 *
 * @author zacharyzordo
 */
public class DiceTower {
    private List<Die> diceInTheTower;
    private int sumOfDice;

    public DiceTower(List<Die> diceInTheTower) {
        this.diceInTheTower = diceInTheTower;
    }
    
    public void whatAreTheDiceValues(){
        int currentDieValue;
        sumOfDice = 0;
        for(Die item : this.diceInTheTower){
            Die currentDie = item;
            currentDie.roll();
            currentDieValue = currentDie.getDieValue();
            //System.out.println(currentDieValue + "\n");
            sumOfDice += currentDieValue;
        }
    }
    
    public int trayValue(){
        return this.sumOfDice;
    }
}
