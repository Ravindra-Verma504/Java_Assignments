class A
{
    int a; String b;
    A()
    {
        a=10; b="Ravi";
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class B
{
    public static void main(String[] args) {
        A r=new A();
        A r2=new A(r);

    }
}