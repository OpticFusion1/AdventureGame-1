/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author steve
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String nameStr = ("default");
        System.out.println("Welcome to the Adventure Game!"+"\n");
        System.out.println("Please enter the name of your character:");
        try
        {
            nameStr = br.readLine();
        }
        catch(Exception exp)
        {
            System.out.println("Error!!!");
        } 
        
        
        System.out.println("Select your occupation:"+"/n"+"/n");
        System.out.println("1: Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Thief");
        
        BufferedReader br1 = new BufferedReader (new InputStreamReader (System.in));
        String choice = "1";
        try
        {
            choice = br1.readLine();
        }
        catch(Exception exp1)
        {
            System.out.println("Error, make a choice from 1 to 3");
        }
      
        
        PlayerCharacter character;
        character = new PlayerCharacter();
        character.setName(nameStr);
        if (choice.equals("1"))
        {
            System.out.println("You have chosen Warrior");
        }
        
        if (choice.equals("2"))
        {
            System.out.println("You have chosen Mage");
        }
        
        if (choice.equals("3"))
        {
            System.out.println("You have chosen Thief");
        }
    
        
        
        System.out.println("Your character has been named: "+character.getName());
    }
    
}
