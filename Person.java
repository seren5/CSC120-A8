import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    
    ArrayList<Inventory> inventoryItems = new ArrayList<>();

    public void grab(String item){
        Inventory.add(item);
    }
    
    public String drop(String item) {

    }
    
    public void examine(String item){

    }

    public void use(String item) {

    }
    
    public boolean walk(String direction){

    }

    public boolean fly(int x, int y){
        System.out.println("You can't fly, silly!");
        return false;
    }

    public Number shrink(){
        if
    }
    
    public Number grow(){

    }

    public void rest(){

    }
    
    public void undo(){

    }

    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to eat/drink?");

        String userInput = sc.nextLine();
    }

}
