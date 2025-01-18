
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;

  }
}

public class linkedList {

  public static class InnerlinkedList {

    Node tail = null;
    Node head = null;
    int size = 0;

    void addLast(int data) {

      Node temp = new Node(data);
      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;
      }
      tail = temp;
      size++;
    }

    void addFirst(int data) {
      Node temp = new Node(data);
      if (head == null) {

        tail = temp;

        head = temp;
      }

      else {
        temp.next = head;

        head = temp;
      }
      size++;
    }

    void addAt(int data, int index) {
      if (index == 0) {
        addFirst(data);
        return;
      } else if (index == size()) {
        addLast(data);
        return;
      } else if (index < 0 || index > size()) {
        System.out.println("invaloid index");
        return;
      } else {
        Node t = head;
        Node temp = new Node(data);
        for (int i = 0; i < index - 1; i++) {
          t = t.next;
        }
        temp.next = t.next;
        t.next = temp;

        size++;
      }
      return;

    }

    // size
    int size() {
      int count = 0;
      Node temp = head;
      while (temp != null) {
        count++;
        temp = temp.next;

      }
      // System.out.println(count);
      return count;
    }

    // display
    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;

      }

    }

    // finding nth order from reserse ;

    Node nthNode(int n) {
      Node fast = head;
      Node slow = head;

      for (int i = 0; i <= n; i++) {
        fast = fast.next;

      }
      while (fast != null) {
        slow = slow.next;
        fast = fast.next;

      }
      return slow;

    }

    // display by recursion..
    // public static void displayr(Node head) {
    // Node temp = head;
    // if (temp == null)
    // return;
    // System.out.println(temp.data);
    // displayr(temp.next);

    // }

  }

  public static void main(String[] args) {

    // Node a = new Node(5);
    // Node b = new Node(10);
    // Node c = new Node(15);
    // Node d = new Node(43);
    // Node e = new Node(54);
    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // addLast(90);

    InnerlinkedList li = new InnerlinkedList();
    li.addLast(30);
    li.addLast(34);
    li.addLast(87);
    li.addFirst(40);
    li.addFirst(78);
    li.addAt(456, 3);

    li.display();
    System.out.println(li.size());
    System.out.println(li.size);
   

    System.out.println(li.nthNode(5).data);

  }
}