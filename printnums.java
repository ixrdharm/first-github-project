class printnums
{
    public static void main(String[] args) 
    {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("enter the value of n");
      int n = sc.nextInt();
      for(int i=1; i<=n;i++)
      {
        System.out.println(i);
      }
    }
    
}