import java.util.*;
import java.lang.*;
import java.io.*;
class Position {
    public int findPos(int n) {
        if (n == 1) {
            return 1;
        }
        return 2*findPos(n/2);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Position find = new Position();
        System.out.println(find.findPos(n));
    }
}
