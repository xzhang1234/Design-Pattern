/**
 * Created by xiaoyun on 7/18/17.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        File file = new ProxyFile("test.txt");
        //proxy delegates "show" to object realFile, realFile loads file from disk
        file.show();
        //proxy delegates "show" to object realFile
        file.show();
    }
}
