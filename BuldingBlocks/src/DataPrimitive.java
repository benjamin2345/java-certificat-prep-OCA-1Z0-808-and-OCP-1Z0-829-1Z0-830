public class DataPrimitive {

    public static void main(String[] args) {
        // wrapper classes offer many useful helper methods
        // butevalue(), shortvalue(), intvalue(), floatvalue, doublevalue()
        // booleanvalue(), charvalue()

        Double d = Double.valueOf(314.67);
        System.out.println(d.byteValue()); // 58   (wrap: 314-256=58)
        System.out.println(d.intValue());  // 314
        System.out.println(d.doubleValue()); // 314.67
    }
}
