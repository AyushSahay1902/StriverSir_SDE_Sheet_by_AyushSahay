package Java_Basics;

public class Overloading {
    class A{
        public void F1(){

        }
    }
    class B extends A{
        public void F1(int n){
            System.out.println("Class B :"+ n);
        }
    }

    public class Example1{
        public static void main(String args[]){
            Overloading x = new Overloading();
            Overloading.A a = x.new A(); // Create an instance of the inner class A
            Overloading.B b = x.new B();
            b.F1(5);
        }
    }
}

