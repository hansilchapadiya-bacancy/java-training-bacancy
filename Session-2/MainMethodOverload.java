public class MainMethodOverload {
    
    public static void main(String[] args)
    {
        for (String string : args) {
            
            System.out.println(string);
        }
        // main(args);
    }

    public static void main(int[] args)
    {
        for (int  i : args) {
            
            System.out.println(i * 2 );
        }
    }

    public static void main()
    {
        System.out.println("Hello");
    }

}
