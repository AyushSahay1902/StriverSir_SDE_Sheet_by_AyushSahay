package Java_Basics;
public class exception_handling {
    public static void main(String args[]){
        String s1 = "Ayush Sahay";
        System.out.println("Sreing length" + s1.length());
        int balance = 5000;
        int wid = 6000;

        //Use of throws keywoed
        //throws ArithmeticException(e);

        // try{
        //     if(balance  < wid){
        //         throw new ArithmeticException("Insufficient Balance");
        //     }
        //     System.out.print(3/0);
        //     System.out.println(" Try ");
        // }catch(ArithmeticException e){
        //     System.out.println("Exception" + e.getMessage());
        // }finally{
        //     //finally block runs guarentdly.
        // }




    }
    
}
//Unchecked Expection: Runtime Exception like ArrayIndexOutOfBound, NullPointerException
//