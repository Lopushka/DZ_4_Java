package EX_1;

import java.util.LinkedList;

/**
 * EX_1
 */
public class EX_1 {
    public static void main(String[] args) {
        LinkedList<String> lister = new LinkedList<>();
        lister.add("1");
        lister.add("2");
        lister.add("3");
        lister.add("4");
        lister.add("5");
        
        System.out.println(lister);
        System.out.println("Перевёрнутый "+ revers(lister));
    }
    public static LinkedList<String>revers(LinkedList<String> name){
        LinkedList<String> result = new LinkedList<String>();

        for (int i = name.size()-1; i >= 0; i--) {
            result.add(name.get(i));
            
        }
        return result;
    }
}