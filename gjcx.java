import java.util.Scanner;
        class gjcx{
    public static void main(String[] args){
        System.out.println("请输入数");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         gujiaochaixiang b = new gujiaochaixiang();
         b.gjcx(a);
    }
            }
            class gujiaochaixiang{
           public void gjcx(int a){
            while (a != 1) {
                if(a%2==0){
                    a /=2;
                    System.out.println(a);
                } else if (a % 2 !=0) {
                    a =a*3+1;
                    System.out.println(a);
                }
            }
            System.out.println("end");
           }
            }