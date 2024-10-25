public class node {
    Student data;
    node next;
    node prev;

    node (node prev, Student data, node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
