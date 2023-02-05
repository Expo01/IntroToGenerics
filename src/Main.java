import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList items = new ArrayList<>(); //type not defined so can add whatever. Raw ArrayList. We never
        //want to use raw types anymore since they crash too easily.
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add("tim");
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items); //problem is that the printDouble method doesn't know anything is wrong. It accepts
        // an object and tries to cast the String to an Integer and gets an exception

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);
    }

//    private static void printDoubled(ArrayList n) {
//        for(Object i : n) {
//            System.out.println( (Integer) i * 2);
//        }
//    }
    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}