import java.util.Stack;

class javaCollections {

    public static void main(String[] args) {
        
        Stack<String> Name=new Stack<>();  // LIFO- Last in first out
        Name.push("Ankit");
        Name.push("Ankush");
        Name.push("Abhi");

        System.out.println(Name);
        Name.pop();
        System.out.print(Name);
        
        
    }
}
