class q3
{
    static void pattern(int n) {

        int a = 0;int b=0;int c=1;

        for (int i = 3; i<=n; i++) {
            {
                int d = a+b+c;
                a=b;
                b=c;
                c=d;
                System.out.println("\t"+d);
            }
        }
    }
        public static void main(String args[]) {
            int j =10;
            pattern(j);
        }
            
        }
        