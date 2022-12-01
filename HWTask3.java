package Java_DZ.JAVA_DZ_sem4;
import java.util.Collections;
import java.util.LinkedList;
public class HWTask3 {
    // Пусть дан LinkedList с несколькими элементами. 
    // Реализуйте метод, который вернет “перевернутый” список.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(17);
        list.add(331);
        list.add(51);
        list.add(89);
        list.add(61);
        list.add(713);
        System.out.println(list);
        LinkedList<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
    public static <T> LinkedList<T> reverseList(LinkedList<T> list1) {
        LinkedList<T> reverse = new LinkedList<>(list1);
        Collections.reverse(reverse);
        return (LinkedList<T>) reverse;
    } 
    }

