package comparision;

public class LineComparisionUC2 {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 3;
        int y1 = 3;
        int y2 = 3;

        System.out.println(x1 + " == " + x2 + " : " + (x1 == x2));
        System.out.println(x1 + " == " + y1 + " : " + (x1 == y1));
        System.out.println(x2 + " == " + y2 + " : " + (x2 == y2));
        System.out.println(x1 + " == " + y2 + " : " + (x1 == y2));
    }
}
