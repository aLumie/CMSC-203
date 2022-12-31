// Class
 
public class Mage
{
    // Attributes
    String type;
    String element;
    int health;
    int mana;

    // Behaviors
    boolean run;
    boolean attack;
    boolean skill;

 
    public Mage(String type, String element, int health, int mana ){
        this.type = type;
        this.element = element;
        this.health = health;
        this.mana = mana;
        
    }
 
    // method 1
    public String getType()
    {
        return type;
    }
 
    // method 2
    public String getElement()
    {
        return element;
    }
 
    // method 3
    public int getHealth()
    {
        return health;
    }
 
    // method 4
    public int getMana()
    {
        return mana;
    }
 
    @Override
    public String toString()
    {
        return("Type : " + this.getType() + "\n" + "Element: " + this.getElement() + "\n" + "Health: " + this.getHealth() + "\n" + "Mana: "  + this.getMana());     
    }
 
    public static void main(String[] args)
    {
        Mage Human = new Mage("Human","Fire", 20, 20);
        System.out.println(Human.toString());
    }
    
    // theoritically the game starts
    public Mage(boolean run, boolean attack, Boolean skill){
        this.run = run;
        this.attack= attack;  
        this.skill = skill;
    }
    public boolean getRun()
    {
        return run;
    }
    public boolean getAttack()
    {
        return attack;
    }
    public boolean getSkill()
    {
        return skill;
    }
    
    //Declaring how the class will take action
    public void Running(){
        if (run == true)
            System.out.println("The character is already running");
        else {
            run = false;
            System.out.println("Hold Shift to Run");
        }
        }
    public void Attacking(){
        if (attack == true)
            System.out.println("The character is already attacking");
        else {
            attack = false;
            System.out.println("Press LMouse to Attack");
        }        
        }   
    public void Skills(){
        if (skill == true)
            System.out.println("The Skill is in Cooldown");
        else {
            skill = false;
            System.out.println("Press E to use Skill");
        }       
    }
}
 
