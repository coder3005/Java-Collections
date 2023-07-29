import java.util.LinkedList;

class javaCollections {

    public static void main(String[] args) {
        
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Abhi");

        for(String str:Name)
        {
            System.out.println(str);
        }
        
        
    }
}
