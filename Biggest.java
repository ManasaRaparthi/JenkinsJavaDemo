class Biggest
{
        public static void main(String args[])
        {
                int a=10;
                int b=20;
                int c=30;
                if(a<b && a<c)
                {
                        System.out.println("Biggest number"+a);
                }
                if(b<a && b<c)
                {
                        System.out.println("Biggest number"+b);
                }
                if(c<b && c<a)
                {
                        System.out.println("Biggest number"+c);
                }
        }
}
