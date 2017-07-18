/**
 * Created by xiaoyun on 7/18/17.
 */
public class RealFile implements File {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void show() {
        System.out.println("Print real file" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}



