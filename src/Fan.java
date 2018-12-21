//---------------------------------------------------------------
//         COSC 1337.S01
//         Lab 4
//         2015/3/26
//         Fan.java
//---------------------------------------------------------------
public class Fan {
        public final int SLOW = 1;
        public final int MEDIUM = 2;
        public final int FAST = 3;
        private int speed = SLOW;
        private boolean on;
        private double radius;
        private String color;
        public Fan (){
            speed = SLOW;
            on = false;
            radius = 5;
            color = "white";
            System.out.println("Fan class - default constructor");
        }
        public Fan (int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
            System.out.println("Fan class - overloaded constructor");
        }
        public int getSpeed (){return speed;}
        public void setSpeed (int speed){this.speed = speed;}
        public boolean isOn (){return on;}
        public void setOn (boolean on){this.on = on;}
        public double getRadius (){return radius;}
        public void setRadius (double radius){this.radius = radius;}
        public String getColor (){return new String(color);}
        public void setColor (String color){this.color = color;}
        @Override
        public String toString (){
            String x;
            x = " " + speed + " " + on + " " + radius + " " + color;
            return x;
        }
}