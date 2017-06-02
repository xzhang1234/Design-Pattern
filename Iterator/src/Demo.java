/**
 * Created by xiaoyun on 6/2/17.
 */
public class Demo {
    public static void main(String[] args) {
        Container container = new ArrayContainer();

        for(Iterator iter = container.iterator(); iter.hasNext(); ) {
            System.out.println((Integer) iter.next());
        }

    }

}
