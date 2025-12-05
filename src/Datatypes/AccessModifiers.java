package Datatypes;

public class AccessModifiers {
    public int a=5;
    private int b=2;
    protected String s="abc";

    public int getter(){
        return b;
    }
}
class Main{
    public static void main(String[] args){
        AccessModifiers am=new AccessModifiers();
        System.out.println(am.a);
        //System.out.println(am.b);//private variable not accessible
        System.out.println(am.getter());
        System.out.println(am.s);
    }
}