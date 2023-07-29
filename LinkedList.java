import java.util.LinkedList;

class javaCollections {

    public static void main(String[] args) {
        
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Abhi");

        System.out.println(Name);
        Name.addFirst("Rohit");
        Name.addLast("Amir");
        System.out.println(Name);
        Name.add(3,"Anish");
        System.out.println(Name);
        
    }
}
