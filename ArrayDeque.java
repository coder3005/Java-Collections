import java.util.ArrayDeque;

class javaCollections {

    public static void main(String[] args) {
        
        ArrayDeque<String> Name=new ArrayDeque<>();  // FIFO- first in first out
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Abhi");

        System.out.println(Name);
        Name.remove();
        System.out.print(Name);
        
        
    }
}
