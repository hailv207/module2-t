public class MyNewLinkedListTest {
    public static void main(String[] args) {
        Student hai = new Student("Hai", 32);
        MyNewLinkedList newLinkedList = new MyNewLinkedList(hai);
        newLinkedList.add(new Student("Tung", 27));
        newLinkedList.printList();
        newLinkedList.add(1, new Student("Long", 33));
        newLinkedList.printList();
        Student tung = new Student("Tung", 27);
        System.out.println(newLinkedList.contains(tung));
        System.out.println(newLinkedList.remove(1));
        newLinkedList.printList();
        System.out.println(newLinkedList.remove(hai));
        newLinkedList.printList();

    }
}
