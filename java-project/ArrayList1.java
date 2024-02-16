import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1
 {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);

        System.out.println(al);
        
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        
        for (int i : al) {
            System.out.println(i);
        }
    }
}
