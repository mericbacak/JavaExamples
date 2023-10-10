package NumberPrograms;

public class ReverseNumber1 {

        public static void main(String[] args) {
            //Initialize array
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
            System.out.println("Duplicate elements in given array: ");
            //Searches for duplicate element
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j])
                        System.out.println(arr[j]);
                }
            }


        }


    public  void main2(String[] args)
    {
        int number = 123456, reverse = 0;
//we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}