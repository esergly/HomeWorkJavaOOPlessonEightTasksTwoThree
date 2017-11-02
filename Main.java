import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BlackList blackList = new BlackList();
        Stack stack = new Stack(5, blackList);

        blackList.addClassToBlackList(Scanner.class);
        stack.putInStack(new BufferedInputStream(System.in));
        stack.putInStack(new Scanner(System.in));
        stack.putInStack(new String());
        stack.putInStack(new Date());
        stack.putInStack(new Object());
        stack.putInStack(new Integer(12));
        stack.putInStack(new BigInteger(String.valueOf(1234567890)));

        System.out.println(stack);
        System.out.println(stack.last());
        System.out.println(stack.last().getClass());
        System.out.println(stack.first());

    }
}


