import java.util.ArrayList;

class javaCollections {

    public static void main(String[] args) {
        
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Abhi");

        System.out.println(Name);
        Name.remove(1);
        System.out.println(Name);
    }
}
