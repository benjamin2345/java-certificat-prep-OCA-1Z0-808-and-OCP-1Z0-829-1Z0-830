public class LVTI {

    // you can not assign null to LVTI (it's impossible to infer type)

    //var s = null;  //DOESN'T COMPILE

    // var is not the reserved word ( for backward compatibility reasons)

    //public class Var {}  // ok
    public static void main(String[] args) {
        //var var = 5; // OK
        //var var = new var(); // ok
    }

    /*
    // remember - only local variables!
    public int sum(var a, var b) {
        int result = a + b;
        return result;
    } // DOES NOT COMPILE
     */

    /*
    // pratical usage

    // old way
    SomeCLassWithVeryVeryLongName myInstance = new SomeCLassWithVeryVeryLongName();

    // new way
    var myInstance = new SomeCLassWithVeryVeryLongName();

    // old way
    ClintList<CLient> clientList = new SomeCLassWithVeryVeryLongName().getCLientList();

    //new way
    var clientList = new SomeCLassWithVeryVeryLongName.getCLientList();
     */

}
