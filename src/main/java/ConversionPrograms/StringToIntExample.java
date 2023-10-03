package ConversionPrograms;

public class StringToIntExample {
    public static void main(String[] args){
        //Declaring String variable
        String s="200";
        //Converting String into int using Integer.parseInt()
        int i=Integer.parseInt(s);
        //Printing value of i
        System.out.println(i);

        //Declaring String variable
        String s2="300";
        //Converting String into int using Integer.parseInt()
        int i2=Integer.parseInt(s2);
        System.out.println(s2+100);//300100, because "300"+100, here + is a string concatenation operator
        System.out.println(i2+100);//400, because 300+100, here + is a binary plus operator
        //Declaring a string
        String s3="400";
        //converting String into Integer using Integer.valueOf() method
        Integer i3=Integer.valueOf(s3);
        System.out.println(i3);
    }
}
