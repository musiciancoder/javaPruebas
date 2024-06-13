package colecciones.myqueues.dequeues;

import java.util.*;

public class Hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        Set uniqueElements = new HashSet<Integer>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniqueCount = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            uniqueElements.add(num);

            if (deque.size() == m + 1) {
                int removed = (int) deque.remove();
        //        if (!deque.contains(removed)) {
                    uniqueElements.remove(removed);
          //      }
            }

            maxUniqueCount = Math.max(maxUniqueCount, uniqueElements.size());
        }

        System.out.println(maxUniqueCount);
        }
    }

