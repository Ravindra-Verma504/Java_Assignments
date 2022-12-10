class A 
{
    int a; double b; String c;
    private A()
    {
        a=10; b=30.45; c="ravi";
        System.out.println(a+" "+b+" "+c);

    }
    public static void main(String[] args) {
        A r=new A();
    }
    
}
