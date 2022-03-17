import java.util.*;

public class StringBuilder {
    public static void main(string args[]);

    StringBuilder sb = new  StringBuilder("hello");for(
    int i = 0;i<sb.lenght()/2;i++)
    {
        int front = i;
        int back = sb.lenght() - 1 - i;

        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);
    }System.out.println();
}

}
