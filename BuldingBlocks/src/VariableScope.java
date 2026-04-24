public class VariableScope {

    public static void main(String[] args) {
        boolean isOk = true;
        if (isOk) {
            int x = 5;
            System.out.println("x = " + x); // ok
        }

//        System.out.println("This is x: " + x);
        //DOES NOT COMPILE (x is out scope)
    }
}
