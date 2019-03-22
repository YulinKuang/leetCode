import java.util.LinkedList;
import java.util.Queue;

class Solution933 {

    public Solution933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        int top = queue.peek();
        while (top < t - 3000) {
            queue.poll();
            top = queue.peek();
        }
        return queue.size();
    }

    private Queue<Integer> queue;
}
