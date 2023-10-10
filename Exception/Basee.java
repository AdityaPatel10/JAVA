class Basee{
    int a=10, b=0;
    try{
        System.out.println(a/b);
        if(b==0){
            throw(b);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}