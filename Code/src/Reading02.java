public class Reading02 {
    public static int x = 7;
    public int y = 3;
    public static void main(String[] args) {
//        Reading02 r = new Reading02();
//        System.out.println(r.y);
//        System.out.println(Reading02.x);

        Reading02 a = new Reading02();
        Reading02 b = new Reading02();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("Reading02.x = " + Reading02.x);

//        //integers
//        byte largestByte = Byte.MAX_VALUE;
//        short largestShort = Short.MAX_VALUE;
//        int largestInteger = Integer.MAX_VALUE;
//        long largestLong = Long.MAX_VALUE;
//
//        //real numbers
//        float largestFloat = Float.MAX_VALUE;
//        double largestDouble = Double.MAX_VALUE;
//
//        //other primitive types
//        char aChar = 'S';
//        boolean aBoolean = true;
//
//        //Display them all.
//        System.out.println("The largest byte value is "
//                + largestByte + ".");
//        System.out.println("The largest short value is "
//                + largestShort + ".");
//        System.out.println("The largest integer value is "
//                + largestInteger + ".");
//        System.out.println("The largest long value is "
//                + largestLong + ".");
//
//        System.out.println("The largest float value is "
//                + largestFloat + ".");
//        System.out.println("The largest double value is "
//                + largestDouble + ".");
//
//        if (Character.isUpperCase(aChar)) {
//            System.out.println("The character " + aChar
//                    + " is uppercase.");
//        } else {
//            System.out.println("The character " + aChar
//                    + " is lowercase.");
//        }
//        System.out.println("The value of aBoolean is "
//                + aBoolean + ".");
//
//
//        // integers
//        byte smallestByte = Byte.MIN_VALUE;
//        short smallestShort = Short.MIN_VALUE;
//        int smallestInteger = Integer.MIN_VALUE;
//        long smallestLong = Long.MIN_VALUE;
//
//        // real numbers
//        float smallestFloat = Float.MIN_VALUE;
//        double smallestDouble = Double.MIN_VALUE;
//
//        // display them all
//        System.out.println("The smallest byte value is " + smallestByte);
//        System.out.println("The smallest short value is " + smallestShort);
//        System.out.println("The smallest integer value is " + smallestInteger);
//        System.out.println("The smallest long value is " + smallestLong);
//
//        System.out.println("The smallest float value is " + smallestFloat);
//        System.out.println("The smallest double value is " + smallestDouble);
    }
}
