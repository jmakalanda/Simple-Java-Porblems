public class Stack {
    int[] intStack;
    int top = -1;

    public Stack(int capacity){
       this.intStack = new int[capacity];

    }
    public void push(int value) throws Exception {
        if( top < intStack.length)
            intStack[++top] = value;
        else
            throw new Exception("Stack full!!");
    }
    public int pop() throws Exception {
        if( top >= 0 )
            return intStack[top--];
        else
            throw new Exception("Stack Empty!!");
    }
    public int peek(){
        return intStack[top];
    }
}
