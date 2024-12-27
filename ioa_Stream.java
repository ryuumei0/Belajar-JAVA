import java.io.FileInputStream;

public class ioa_Stream {

    public static void main(String[] args) {
        FileInputStream inputfile = new FileInputStream("input.txt");
        System.out.print((char) inputfile.read());
    }
}
