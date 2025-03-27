package Generic;

public class Box<T> {
    T container;
    public Box(T container){
        this.container=container;
    }
    public T getValue(){
        return this.container;
    }

    public void getTask(){
        if(container instanceof String)
        {
            System.out.println("Length of the string will be : "+((String) container).length());
        } else if (container instanceof Integer) {
            System.out.println("Integer value will be : "+ container);
        }
    }
}
