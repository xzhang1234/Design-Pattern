/**
 * Created by xiaoyun on 5/31/17.
 */
public class Demo {
    public static void main(String[] args) {

        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
