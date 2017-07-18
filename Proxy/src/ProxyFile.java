/**
 * Created by xiaoyun on 7/18/17.
 */
public class ProxyFile implements File {
    private File realFile;
    private String fileName;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realFile == null){
            realFile = new RealFile(fileName);
        }
        realFile.show();
    }
}
