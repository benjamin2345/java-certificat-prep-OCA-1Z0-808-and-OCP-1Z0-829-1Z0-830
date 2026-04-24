public class variablesSecondPart {

    public int doesNotCompile() {
//        int a = 5;
//        int b;
        //return a + b; estas tratando de usar una variable no inicializada
        return 0;
    }

    public int doesCompile() {
        int a = 5, b =3;
        int c;
        return a + b;
    }

    // ve careful if initialization is within if-statement
    public void doesNotCompile( boolean isOk) {
        int a;
        if (isOk) a = 5;
        // some code using a
    }

    public void desCompile (boolean isOk){
        int a;
        if (isOk) a = 5;
        else a = 2;
        // some code using a
    }

    // final variables (constants)
    final int MAX_HEIGHT = 100;

    // final can be applied to a reference:
    final int[] MY_NUMBERS = new int[5];

    // reference cannot be modified, but the content of the object can:
//    MY_NUMBERS[2] = 13; // OK
//    MY_NUMBERS = NULL; // DOES NOT COMPILE
}
