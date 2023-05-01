package EX_1;

import java.util.LinkedList;

/**
 * EX_1
 */
public class EX_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lister = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            lister.add(i);
        }
        
        
        
        System.out.println(lister);
        System.out.println("Перевёрнутый "+ revers(lister));
    }
    public static LinkedList<Integer>revers(LinkedList<Integer> name){
        LinkedList<Integer> result = new LinkedList<Integer>();

        for (int i = name.size()-1; i >= 0; i--) {
            result.add(name.get(i));
            
        }
        return result;
    }
}