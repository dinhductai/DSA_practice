import java.io.IOException;
import java.io.InputStream;
import java.util.*;


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        long sumEven = 0, sumOdd =0;
//        int countEven = 0,countOdd = 0;
//
//        for(int i=0;i<N;i++){
//            int inp = sc.nextInt();
//            if(inp%2==0){
//                sumEven+=inp;
//                countEven++;
//            }
//            else {
//                sumOdd+=inp;
//                countOdd++;
//            }
//        }
//        System.out.println(countEven);
//        System.out.println(sumEven);
//        System.out.println(countOdd);
//        System.out.println(sumOdd);
//
//    }
//
//static class FastScanner{
//    private final InputStream ip;
//    private final byte[] buf = new byte[1<<16];
//    private int ptr =0; int len=0;
//
//    FastScanner(InputStream ip) {
//        this.ip = ip;
//    }
//
//    private int readByte() throws IOException {
//        if(ptr>= len){
//            len = ip.read(buf);
//            ptr = 0;
//            if(len <= 0) return -1;
//        }
//        return buf[ptr++];
//    }
//
//    long nextLong() throws IOException {
//        int c;
//        do{
//            c=readByte();
//        }while(c<=' ' && c!=-1);
//        long sign =1;
//        if (c == '-') { sign = -1; c = readByte(); }
//        long val = 0;
//        while (c > ' ') {
//            val = val * 10 + (c - '0');
//            c = readByte();
//        }
//        return val * sign;
//    }
//}
//public static void main(String[] args) throws IOException {
//    FastScanner fs = new FastScanner(System.in);
//    int N = (int) fs.nextLong();
//    long sumEven = 0, sumOdd =0;
//    int countEven = 0,countOdd = 0;
//
//    for(int i=0;i<N;i++){
//        long x = fs.nextLong();
//        if((x&1L) == 0){
//            sumEven += x;
//            countEven++;
//        }else {
//            sumOdd += x;
//            countOdd++;
//        }
//    }
//        System.out.println(countEven);
//        System.out.println(sumEven);
//        System.out.println(countOdd);
//        System.out.println(sumOdd);

//
//public static void main(String[] args) throws IOException {
//    FastScanner fs = new FastScanner(System.in);
//    int n = (int) fs.nextLong();
//    long sumEven = 0, sumOdd = 0;
//    int countEven = 0, countOdd = 0;
//    for(int i = 0; i < n; i++) {
//        int x= (int) fs.nextLong();
//        if((x & 1) == 0) {
//            sumEven += x;
//            countEven++;
//
//        }else {
//            sumOdd += x;
//            countOdd++;
//
//        }
//
//    }
//
//    System.out.println(countEven);
//        System.out.println(sumEven);
//        System.out.println(countOdd);
//        System.out.println(sumOdd);
//}
//

static boolean isPrime(int x){
    if(x<2) return false;
    for(int i=2;i<=Math.sqrt(x);i++){
        if(x%i==0) return false;
    }return true;
}
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double sum=0;
    int count =0;
    for(int i=0;i<n;i++){
        int x = sc.nextInt();
        if(isPrime(x)){
            sum+=x;
            count++;
        }
    }

    double avg = sum / count;
    System.out.printf("%.3f", avg);
}
