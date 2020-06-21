public class MyNewListTest {
    public static void main(String[] args) {
        MyNewList<Student> myNewList = new MyNewList<>();
        Student hai = new Student("Hai",32);
        Student tung = new Student("Tung",27);
        myNewList.add(hai);
        myNewList.add(tung);

        System.out.println("myNewList:");
        System.out.println("size: " + myNewList.size());
        for (int i = 0; i < myNewList.size();i++){
            System.out.println(myNewList.get(i).toString());
        }

        System.out.println("contains hai: " + myNewList.contains(hai));
        System.out.println("indexOf hai: " + myNewList.indexOf(hai));
        System.out.println("get(index = 1)" + myNewList.get(1).toString());
        System.out.println("remove(index = 0): " + myNewList.remove(0));
        System.out.println("myNewList after removing:");
        System.out.println("size: " + myNewList.size());
        for (int i = 0; i < myNewList.size();i++){
            System.out.println(myNewList.get(i).toString());
        }
        myNewList.clear();
        System.out.println("myNewList after clear:");
        for (int i = 0; i < myNewList.size();i++){
            System.out.println(myNewList.get(i).toString());
        }

    }
}

