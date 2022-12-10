class A {
    int x,y;
    A(int a,int b)
    {
        x=a; y=b;
    }
    A(int a,String b)
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
    
}
class B
{
    public static void main(String[] args) {
        A r=new A(100,200);
        r.show();
        A ref=new A(10, "ravi");
        ref.show();
    }
}
