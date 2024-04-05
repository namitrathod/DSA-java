package StackandQueue;

public class DynamicStack extends customStack{
    
    public DynamicStack(){
        super();  // it will call customStack()
    }
    public DynamicStack(int size){
        super(size);  // it will call customStack(size)
    }
    @Override
    public boolean push(int item){
        if(isFull()){
            int[] temp = new int[data.length*2];
            for(int i =0; i<data.length;i++){
                temp[i]= data[i];
            }
            // System.arraycopy(data, 0, temp, 0, data.length);    alternative for above code
            data = temp;
        }
        return super.push(item);
    }
}
