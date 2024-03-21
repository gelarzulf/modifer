public class AcceesModifer {
    public int publicNumber;
    protected int protectedNumber;
    int defaultNumber;
    private int privateNumber;

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defautlMethod() {
        System.out.println("This is a default method");
    }

    private void  privateMethod() {
        System.out.println("This is a private method");
    }
}