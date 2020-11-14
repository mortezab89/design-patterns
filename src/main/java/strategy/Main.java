package strategy;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class Main {

    public static void main(String[] args) {
        SocialMediaContext socialMediaContext = new SocialMediaContext();

        ISocialMediaStrategy facebookStrategy = new FacebookStrategy();
        socialMediaContext.setiSocialMediaStrategy(facebookStrategy);
        socialMediaContext.connect("Morteza");

        ISocialMediaStrategy linkedinStrategy = new LinkedinStrategy();
        socialMediaContext.setiSocialMediaStrategy(linkedinStrategy);
        socialMediaContext.connect("Ali");

        ISocialMediaStrategy instagramStrategy = new InstagramStrategy();
        socialMediaContext.setiSocialMediaStrategy(instagramStrategy);
        socialMediaContext.connect("Hassan");
    }
}
