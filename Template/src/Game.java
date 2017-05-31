/**
 * Created by xiaoyun on 5/31/17.
 * reference: https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
