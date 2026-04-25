public class gcExample {
    public static void main(String[] args){
        String a, b;
        a = new String("Emperor");
        b = new String("King");
        a = b;
        String c = a;
        a = null;
        System.gc();
    }
}

// en conclusion la linea 6, objeto emperor es elegible para garbage collector
