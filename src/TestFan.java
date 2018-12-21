//---------------------------------------------------------------
//         COSC 1337.S01
//         Lab 4
//         2015/3/26
//         TestFan.java
//---------------------------------------------------------------
public class TestFan {
    public static void main(String args[]) {
        Fan f1 = new Fan(3,true, 10,"yellow");
        System.out.println(f1);
        Fan f2 = new Fan();
        f2.setSpeed(1);
        f2.setOn(true);
        f2.setRadius(31);
        f2.setColor("Orange");
        System.out.println(f2);
        System.out.println(f2.getSpeed());
        System.out.println(f2.isOn());
        System.out.println(f2.getRadius());
        System.out.println(f2.getColor());
    }
}