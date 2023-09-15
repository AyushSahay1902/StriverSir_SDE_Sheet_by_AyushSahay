package Java_Basics;

public class ConstructorChaining {
    
    public ConstructorChaining(){
        System.out.println("A 1");
    }
    class B extends ConstructorChaining{
        public B(){
            super();
            System.out.println("B 1");
        }
    }

    public class example{

        public static void main(String args[]){
            ConstructorChaining obj = new ConstructorChaining();
            ConstructorChaining.B b = obj.new B();
        }
    }
}
