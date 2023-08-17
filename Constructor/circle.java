class circle {
    double area, rad;
    circle(int r) {
        rad = r;
    }
    circle(double r) {
        rad = r;
    }
    void Area() {
        area = 3.14 * rad * rad;
    }
    void display(){
        System.out.println("Area of circle at radius "+ rad + " is= " + area);
    }
    public static void main(String[] args) {
        circle c1 = new circle(5);
        c1.Area();
        c1.display();
        circle c2 = new circle(6.8);
        c2.Area();
        c2.display();
        circle c3 = new circle(12);
        c3.Area();
        c3.display();
    }
}