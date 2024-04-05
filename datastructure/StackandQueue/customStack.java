package StackandQueue;

public class customStack {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);   // here is is used to call customStack(int size) constructor
    }
    public customStack(int size){
        this.data = new int [size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println( "Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot pop from an empty stack");
        }
        // ptr--;
        // return data[ptr];

        return data[ptr--];  // post decrement operator
    }
    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    } 

    public boolean isFull() {
        return ptr == data.length-1;  // pointer is at last index
    }
    public boolean isEmpty() {
        return ptr ==-1;  // pointer is at last index
    }


}
