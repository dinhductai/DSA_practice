import java.io.IOException;
import java.io.InputStream;

class FastScanner{
    private final InputStream ip;
    private final byte[] buf = new byte[1<<16];
    private int ptr =0; int len=0;

    FastScanner(InputStream ip) {
        this.ip = ip;
    }

    private int readByte() throws IOException {
        if(ptr>= len){
            len = ip.read(buf);
            ptr = 0;
            if(len <= 0) return -1;
        }
        return buf[ptr++];
    }

    long nextLong() throws IOException {
        int c;
        do{
            c=readByte();
        }while(c<=' ' && c!=-1);
        long sign =1;
        if (c == '-') { sign = -1; c = readByte(); }
        long val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
    }
}