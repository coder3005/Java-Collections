import java.util.ArrayList;

class javaCollections {

    public static void main(String[] args) {
        
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Abhi");

        System.out.println(Name);
        Name.add("Anish");
        System.out.println(Name);
        Name.add(1,"Rohit");
        System.out.println(Name);
        Name.add(0,"Amir");
        System.out.println(Name);
    }
}
