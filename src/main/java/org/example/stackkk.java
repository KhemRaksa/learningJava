package org.example;
import java.util.Stack;

public class stackkk {


    // Stack is LIFO - last in, first out.
    //
    public void someStackOperations() {
        Stack<String> stakee = new Stack<String>();

        stakee.push("Minecraft");
        stakee.push("Skyrim");
        stakee.push("DOOM");

        stakee.pop();
        System.out.println(stakee.empty());
        System.out.println(stakee);
    }

}
