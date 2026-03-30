// simples Java class

//class Student {
//
//}

// in file Student.java
public class Student {
    String name;
    //este es un metodo
    public String getName(){
        return name;
    }


    public void setName(String theName) {
        name = theName;

        //this is one-line comment
        System.out.println('a'); // this will print a
        System.out.println('a'); /* this will print a */

        /*
         * usual way to write multiline comments
         * it's very readable like this
         */

        /**
         * Javadoc style offers you some nice features
         * @author Benjamin Avila
         */
    }
}
