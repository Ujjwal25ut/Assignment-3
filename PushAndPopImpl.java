package assignment3June27;

import java.util.Stack;
interface stack{
    static Stack<Integer> st = new Stack<Integer>();
}

class PushOperation extends Thread implements stack{
    public void run(){
        try {
            for(int i=1;i<7;i++) {
                    Thread.sleep(2000);
                    System.out.println("inserted: "+ st.push(i) +  " and stack: "+st);

            }

        } catch (Exception e) {
            System.out.println("Exception is in push opeartion");
        }
    }
}
class PopOperation extends Thread implements stack{
    public void run(){
        try {
            for(int j=1;j<6;j++) {
                        Thread.sleep(3000);
                        if(!st.empty())
                               System.out.println("removed: "+ st.pop()+ " and stack: "+st);

                        else 
                            System.out.println("stack is empty and stack: "+st);
            }


        } catch (Exception e) {
            System.out.println("Exception is in pop-operation");
        }
    }
}
public class PushAndPopImpl {
    public static void main(String[] args) {
        PushOperation push_thread = new PushOperation();
        PopOperation pop_thread = new PopOperation();
        push_thread.start();
        pop_thread.start();

    }

}