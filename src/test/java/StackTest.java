import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void StackTest(){
        try {
            Stack myStack = new Stack(10);
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            myStack.push(4);
            myStack.push(5);
            myStack.push(6);

            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}