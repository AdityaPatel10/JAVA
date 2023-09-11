public class Wrap {
    public static void main(String[] args) {
        byte a=0;
        Byte byteobj= new Byte(a);
        int i=10;
        Integer intobj= new Integer(i);
        System.out.println(byteobj);        
        System.out.println(intobj);
        int in=intobj;
        System.out.println(in);
    }
}
