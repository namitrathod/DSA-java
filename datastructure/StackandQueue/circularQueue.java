package StackandQueue;


public class circularQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE= 10;

    protected int end = 0;
    protected int front =0;
    private int size =0;

    public circularQueue(){
        this(DEFAULT_SIZE);   // here is is used to call customStack(int size) constructor
    }
    public circularQueue(int size){
        this.data = new int [size];
    }


    public boolean isFull() {
        return size == data.length;  // pointer is at last index
    }
    public boolean isEmpty() {
        return size ==0;  // pointer is at last index
    }

    public boolean insert (int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("empty!!!");
        }
        int remove = data[front++];
        front = front%data.length;
        size--;
        return remove;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i =front;
        do{
            System.out.print(data[i]+"-> ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.print("end");
    }
}
