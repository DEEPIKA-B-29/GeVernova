package Datatypes;

public class datatypesex {
    byte bytevalue;
    short shortvalue;
    int intvalue;
    long longvalue;
    float floatvalue;
    double doublevalue;
    char charvalue;
    boolean booleanvalue;

    public static void main(String[] args){
        datatypesex dataTypesExample=new datatypesex();//reference variable
        String a="abc";
        System.out.println("Byte: "+dataTypesExample.bytevalue);
        System.out.println("Short: "+dataTypesExample.shortvalue);
        System.out.println("INT: "+dataTypesExample.intvalue);
        System.out.println("Long: "+dataTypesExample.longvalue);
        System.out.println("Float: "+dataTypesExample.floatvalue);
        System.out.println("Double: "+dataTypesExample.doublevalue);
        System.out.println("Char: "+dataTypesExample.charvalue);
        System.out.println("Boolean: "+dataTypesExample.booleanvalue);
        System.out.println(a);
    }
}
