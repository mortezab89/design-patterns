package strategy;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class SocialMediaContext {
    ISocialMediaStrategy iSocialMediaStrategy;

    public void setiSocialMediaStrategy(ISocialMediaStrategy iSocialMediaStrategy) {
        this.iSocialMediaStrategy = iSocialMediaStrategy;
    }

    public void connect(String name){
        iSocialMediaStrategy.connectTo(name);
    }
}
