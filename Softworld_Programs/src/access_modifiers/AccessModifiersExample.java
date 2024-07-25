package access_modifiers;

public class AccessModifiersExample 
{

    
    public int publicVar = 10;

    
    protected int protectedVar = 20;

    int defaultVar = 30;

    
    private int privateVar = 40;

    
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

       
        System.out.println("Accessing variables and methods from the same class:");
        System.out.println("Public variable: " + example.publicVar);
        System.out.println("Protected variable: " + example.protectedVar);
        System.out.println("Default variable: " + example.defaultVar);
        System.out.println("Private variable: " + example.privateVar);
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}