import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queueQ1 {
    public static void main(String[] args) {
        int k = 5;

        Queue <Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        int s1=q.size();
        System.out.println(q);

        Deque<Integer> d = new LinkedList<>();
        // int i=0;

        for (int i = 0; i < k; i++) {

            d.addFirst(q.remove());

        }
        for (int i = 0; i < s1-k; i++) {

            d.addLast(q.remove());

        }

        System.out.println(d);
        int s = d.size();

        for (int i = 0; i < s; i++) {
            q.add(d.remove());

        }
        // while (d.isEmpty()) {
        // q.add(d.pop());

        // }

        System.out.println(q);

    }

}
