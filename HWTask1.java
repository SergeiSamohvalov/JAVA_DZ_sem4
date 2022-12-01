package Java_DZ.JAVA_DZ_sem4;
import java.util.LinkedList;
public class HWTask1 {
    // Написать метод, который принимает массив элементов,
    // помещает их в стэк и выводит на консоль содержимое стэка
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);
        stack.add(17);
        stack.add(331);
        stack.add(51);
        stack.add(89);
        stack.add(61);
        stack.add(713);
        System.out.println(stack);
    } 
    
}
