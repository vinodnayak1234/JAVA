class ClassName {
    // Static variables
    static int staticVariable;

    // Static block
    static {
        // Initialization code
        staticVariable = 10;
        System.out.println("Static block executed.");
    }

    // Constructor
    public ClassName() {
        System.out.println("Constructor executed.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Accessing static variable
        System.out.println("Static Variable: " + staticVariable);

        // Creating an instance of the class
        ClassName obj = new ClassName();

        // Calling static method
        ClassName.staticMethod();
    }
}
