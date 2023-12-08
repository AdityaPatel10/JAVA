class MyException extends Exception {
    MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("MyException");
        } catch (MyException e) {
            System.out.println("Catched");
            System.out.println(e.getMessage());
        }
    }
}