import java.util.ArrayDeque;

public class ArrayDqueuDemo {
    public static void main(String [] args){
        ArrayDeque dq=new ArrayDeque();
         dq.offer(10);
         dq.offer(20);
         dq.offerFirst(80);
         dq.offerLast(90);
         dq.offer(100);

         System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println( dq.peek());
System.out.println("********************");
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
