import java.util.Arrays;

public class Stack {
    private Object[] items;
    private int size;
    private int top = 0;
    private BlackList blackList;

    public Stack(int size, BlackList blackList) {
        super();
        this.items = new Object[size];
        this.size = size;
        this.blackList = blackList;
    }

    public void putInStack(Object object) {
        if (blackList.checkObjectInBlackList(object)) {
            System.out.println("Sorry, but this class marked as \"black lists class\".");
            return;
        }else if (top == size) {
            System.out.println("Sorry, but there is no more free position in the Stack.");
            return;
        }
        items[top] = object;
        top++;
    }

    public Object last() {
        if (top == 0) {
            return null;
        }
        Object item = items[top - 1];
        items[top - 1] = null;
        top--;
        return item;
    }

    public Object first() {
        if (top == 0) {
            return null;
        }
        return items[top - 1];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "items=" + Arrays.toString(items) +
                ", maxSize=" + size +
                ", top=" + top +
                ", blackList=" + blackList +
                '}';
    }
}