/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author steve
 */
public class PlayerCharacter {
    
    String name;
    private int strength;
    private int constitution;
    private int dexterity;
    private int quickness;
    private int hitpoints;
    
    //--Method 1: Getter for name var
    public String getName()
    {
    return name;
    }
    
    //--Method 2: Getter for strength var
    public int getStrength()
    {
        return strength;
    }
    
    //Method 3: Getter for constitution var
    public int getConstitution()
    {
        return constitution;
    }
    
    //Method 4: Getter for dexterity var
    public int getDexterity()
    {
        return dexterity;
    }
    
    //Method 5: Getter for quickness var
    public int getQuickness()
    {
        return quickness;
    }
    
    //Method 6: Getter for hitpoints var
    public int getHitpoints()
    {
        return hitpoints;
    }
    
    //Method 7: Setter for name var
    public void setName (String name)
    {
        this.name = name;
    }
    
    //Method 8: Setter for strength var
    public void setStrength (int strength)
    {
        this.strength = strength;
    }
    
    //Method 9: Setter for constitution var
    public void setConstitution (int constitution)
    {
        this.constitution = constitution;
    }
    
    //Method 10: Setter for dexterity var
    public void setDexterity (int dexterity)
    {
        this.dexterity = dexterity;
    }
    
    //Method 11: Setter for quickness var
    public void setQuickness (int quickness)
    {
        this.quickness = quickness;
    }
    
    //Method 12: Setter for hitpoints var
    public void setHitpoints (int hitpoints)
    {
        this.hitpoints = hitpoints;
    }
}
