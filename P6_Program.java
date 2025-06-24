class P6_Program {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        a = b;
        b = a;
        int c = 45;
        b = c;
        c = a;
        a = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }    
}
