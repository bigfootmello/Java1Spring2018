/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

public class Game {
    
    public static void main(String[] args) {
        
        //This will give me a 10x10 field.
        MineField mineField = new MineField();
        mineField.print();
        
        //This will give me a 12,3 field.
        MineField customField = new MineField(12, 3, 10);
        customField.print();
        
        MineField custom2 = new MineField(80, 80, 400);
        custom2.print();
    }
}
