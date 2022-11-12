public class Reading01 {
    public static void Computing_Hailstones(int hailstones){
        System.out.print(hailstones + ", ");
        if(hailstones == 1){
            System.out.println("the hailstone sequence reaches 1");
            return;
        }
        if(hailstones % 2 == 0){
            Computing_Hailstones(hailstones / 2);
        }
        else {
            Computing_Hailstones(hailstones * 3 + 1);
        }
    }

    public static void main(String[] args) {
        Computing_Hailstones(2);
        Computing_Hailstones(3);
        Computing_Hailstones(4);
        Computing_Hailstones(5);
        Computing_Hailstones(7);
    }
}
