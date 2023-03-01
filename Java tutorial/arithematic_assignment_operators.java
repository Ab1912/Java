/*Compound Operator	Sample Expression	Expanded Form
    +=	                x+=2	            x=x+2
    -=	                y -=6	            y=y-6
    *=	                z *=7	            z=z*7
    /=	                a /=4	            a=a/4
    %=	                b %=9	            b= b%9_
    */

class arithematic_assignment_operators
{
    public static void main(String[] args) {
        int a=123;
        System.out.println(a);
        a+=10;
        System.out.println(a);
        a-=10;
        System.out.println(a);
        a*=10;
        System.out.println(a);
        a/=10;
        System.out.println(a);
        a%=10;
        System.out.println(a);
    }
}
