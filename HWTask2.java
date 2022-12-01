package Java_DZ.JAVA_DZ_sem4;
import java.util.ArrayDeque;
import java.util.Queue;
public class HWTask2 {
    // Написать метод, который принимает массив элементов,
    // помещает их в очередь и выводит на консоль содержимое очереди.
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(17);
        queue.add(331);
        queue.add(51);
        queue.add(89);
        queue.add(61);
        queue.add(713);
        System.out.println(queue);
    }
}
