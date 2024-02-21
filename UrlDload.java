import java.io.*;
import java.net.*;
import java.util.Date;

/**
 * UrlDload
 */
public class UrlDload {

    public static void main(String[] args) throws Exception {
        URL u = new URL("https://book.huihoo.com/goalkicker.com/JavaBook/JavaNotesForProfessionals.pdf");
        URLConnection uc = u.openConnection();
        System.out.println("Date : " + new Date(uc.getDate()));
        System.out.println("Type : " + uc.getContentType());
        int len = uc.getContentLength();
        System.out.println("Length : " + len);
        if (len > 0) {
            FileOutputStream fout = new FileOutputStream(args[0]);
            System.out.println("===Content===");
            InputStream input = uc.getInputStream();
            int i = 0;
            while (((i = input.read()) != -1) && i < len) {
                fout.write((char) i);
                i++;
            }
            input.close();
            fout.close();
        } else {
            System.err.println("Error in the input/filename");
        }
    }
}