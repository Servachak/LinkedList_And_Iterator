import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new LinkedList<>();

        list.add("olia");
        list.add("taras");
        list.add("maks");
        list.add("oleg");


        System.out.println(list);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){

            String  line = (String) iterator.next();
            if (line.equals("olia")){
                iterator.remove();
            }

        }
        System.out.println(list.toString());

    }

}
