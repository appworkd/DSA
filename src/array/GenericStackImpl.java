package array;

public class GenericStackImpl<T> {
    /*
     * Declare the variables
     * */
    private int top;
    private T[] genericArray;

    /*
     * Initialize the variable by invoking the default constructor
     * */
    @SuppressWarnings("uncheck")
    GenericStackImpl(){
        this.top = -1;
        genericArray = (T[]) new Object[100];
    }
    /*
     * Initialize the variable by invoking the parameterized constructor
     * */
    @SuppressWarnings("uncheck")
    GenericStackImpl(int size){
        this.top = -1;
        genericArray = (T[]) new Object[size];
    }

    /*
     * To check whether stack is empty or not
     * */
    public boolean isEmpty(){
        return top == -1;
    }

    /*
     * To check whether stack is full or not
     * */
    public boolean isFull(){
        return top == genericArray.length-1;
    }

    /*
     * To check the size of stack
     * */
    public int stackSize(){
        return genericArray.length;
    }


    /*
     * To push the element in the stack
     * */
    public void push(T element){
        if(!isFull()){
            genericArray[++top] = element;
        }
    }

    /*
     * To pp the element from the stack
     * */
    public T pop(){
        if(!isEmpty()){
            T removedElement = genericArray[top];
            genericArray[top] = null;
            top--;
            return removedElement;
        }
        else{
          return  null;
        }
    }
    /*
     * To get the top vale of the stack
     * */
    public T top(){
        if(isEmpty()) return null;
        return genericArray[top];
    }

    public static void main(String[] args) {

        GenericStackImpl<Integer> gst = new GenericStackImpl<>(5);

        gst.push(1);
        gst.push(2);
        gst.push(3);
        gst.push(40);
        System.out.println("Stack Top Item line 88: " + gst.top());
        gst.pop();
        System.out.println("Stack Top Item line 90: " + gst.top());


    }
}
