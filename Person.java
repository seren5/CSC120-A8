import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    
    ArrayList<String> inventoryItems = new ArrayList<>();
    
    public void grab(String item){
        inventoryItems.add(item);
        System.out.println("You have grabbed " + item +". " + item + " is now in your inventory.");
    }
    
    public String drop(String item) {
        if (inventoryItems.contains(item)){
            inventoryItems.remove(item);
            return "You have dropped " + item +". " + item + " is no longer in your inventory.";
        }
        else {
            return "You do not have " + item + " in your inventory. Grab it first.";
        }
    }
    
    public void examine(String item){
        if (isFood()){
            System.out.println(item + " looks ravishing...");
        }
        else{
            System.out.println("This cannot be eaten!");
        }
    }

    public void use(String item) {
        if (inventoryItems.contains(item)){
            inventoryItems.remove(item);
            System.out.println("You have used" + item);
        }
    }
    
    public boolean walk(String direction){
        return true;
    }

    public boolean fly(int x, int y){
        System.out.println("You can't fly, silly! You're not a bird... are you?");
        return false;
    }

    public Number shrink(){
        System.out.println("This is not food! You have shrunk!");
        return (-1);
        
    }
    
    public Number grow(){
        System.out.println("You have grown!");
        return (1);
    }

    public void rest(){
        System.out.println("You have taken a nap. You are now well rested!");
    }
    
    public void undo(){

    }

    public boolean isFood(){
        if (userFoodInput.contains("Yes")||userFoodInput.contains("yes")){
            grow();
            return true;
        }
        else {
            shrink();
            return false;
        }
    }

    public static void main(String[] arguments) {
        int size = 1;
        Scanner itemizer = new Scanner(System.in);
        System.out.println("What do you want to eat/drink?");
        String userInput = itemizer.nextLine();
        grab(userInput);


        Scanner foodInput = new Scanner(System.in);
        System.out.println("Is this food? (Yes/No)");
        String userFoodInput = foodInput.nextLine();


        itemizer.close();
        foodInput.close();
    }

}
