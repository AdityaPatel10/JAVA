class circle {
    double area, rad;
    circle(){
        rad=1;
    }
    circle(int r) {
        rad = r;
    }
    circle(double r) {
        rad = r;
    }
    void Calculate_area() {
        area = 3.14 * rad * rad;
    }
    void display(){
        System.out.println(String.format("Area of circle at radius " + rad + " is= "+"%.2f",area));
    }
    public static void main(String[] args) {
        circle c1 = new circle(5);
        c1.Calculate_area();
        c1.display();
        circle c2 = new circle(6.8);
        c2.Calculate_area();
        c2.display();
        circle c3 = new circle(12);
        c3.Calculate_area();
        c3.display();
    }
}