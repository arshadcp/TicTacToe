package Factory;

public class UIFactoryFactory {
    public static UI_factory getFactory( SupportedPlatform supportedPlatform){
        switch(supportedPlatform){
            case IOS: return new IOS_UIfactory();
            case ANDROID: return new Android_UIfactory();
        }
        return null;
    }
    //instead of violating OCP in main Flutter class, we violate OCP here
    //eg:if we want to add MAC if just another case here
}
