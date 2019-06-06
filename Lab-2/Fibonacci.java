
package fibonacci;

public class Fibonacci {
    
    public static byte byte_fibonacci(byte n){
        byte a = 0;
        byte b = 1;
        for(byte i = 0; i<n;i++){
            byte r = (byte)(a+b);
            b = a;
            a = r;
        }
        return a;
    }
    public static short short_fibonacci(short n){
        short a = 0;
        short b = 1;
        for(short i = 0; i<n;i++){
            short r = (short)(a+b);
            b = a;
            a = r;
        }
        return a;
    }
    public static int int_fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i<n;i++){
            int r = a+b;
            b = a;
            a = r;
        }
        return a;
    }
    public static long long_fibonacci(long n){
        long a = 0;
        long b = 1;
        for(long i = 0; i<n;i++){
            long r = (long)(a+b);
            b = a;
            a = r;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("OVERFLOW");
        byte n = 0;
        for(byte i = 1; i<Byte.MAX_VALUE-1;i++){
            byte image = byte_fibonacci(i);
        if (0>image||image>Byte.MAX_VALUE){
            n = i;
            i = Byte.MAX_VALUE-1;
        }
    }
    System.out.println("Para Byte produce Overflow en: "+n);
        
        short sn = 0;
        for(short i = 1; i<Short.MAX_VALUE-1;i++){
            short image = short_fibonacci(i);
        if (0>image||image>Short.MAX_VALUE){
            sn = i;
            i = Short.MAX_VALUE-1;
        }
    }
    System.out.println("Para Short produce Overflow en: "+sn);
    
        int in = 0;
        for(int i = 1; i<Integer.MAX_VALUE-1;i++){
            int image = int_fibonacci(i);
        if (0>image||image>Integer.MAX_VALUE){
            in = i;
            i = Integer.MAX_VALUE-1;
        }
    }
    System.out.println("Para Int produce Overflow en: "+in);
        long ln = 0;
        for(long i = 1; i<Long.MAX_VALUE-1;i++){
            long image = long_fibonacci(i);
        if (0>image||image>Long.MAX_VALUE){
            ln = i;
            i = Long.MAX_VALUE-1;
        }
    }
    System.out.println("Para Long produce Overflow en: "+ln);
    
    
    
    }
    
}
