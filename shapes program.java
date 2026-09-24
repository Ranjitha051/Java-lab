class Shapes {
    static void square(int s) {
        System.out.println("Square Area = " + s*s);
    }

    static void rectangle(int l, int b) {
        System.out.println("Rectangle Area = " + l*b);
    }

    static void triangle(int b, int h) {
        System.out.println("Triangle Area = " + (b*h)/2);
    }

    static void circle(int r) {
        System.out.println("Circle Area = " + Math.PI*r*r);
    }

    public static void main(String[] args) {
        square(5);
        rectangle(6,4);
        triangle(4,3);
        circle(7);
    }
}