import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException{
        final PipedOutputStream f1 = new PipedOutputStream();
        final PipedInputStream f2 = new PipedInputStream();
        f1.connect(f2);
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0; i<10; i++){
                    try{
                        f1.write(i);
                        Thread.sleep(500);
                    }
                    catch(Exception e){}
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                for(int i=0; i<10; i++){
                    try{
                        System.out.println(f2.read());
                    }
                    catch(Exception e){}
                }
            }
        };  
        t1.start();
        t2.start();
    }
}
