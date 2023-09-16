package Java_Basics;

public class threads {
    public static void main(String args[]){
        //To build threads we have two methods
        // 1. Using Runnable Interface - predeclare 
        //--> class A implements Runnable
        //Thread t1 = new threads(new A()); 
        // 2. Using Java.lang.threads 
        // class A extends threads
        //A obj = new A();
        //obj.start();
        //Beter to use runnable interface in java to avoid inheritance errors, in thread class parent class does not exist.
        //States through which thread goes through
        // New thread --> Runnable --> Not runnable --> dead thread.
    }
    
}
