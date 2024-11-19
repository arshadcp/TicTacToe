package Factory;

public class UIFactoryFactory {
    public static UI_factory getFactory( SupportedPlatform supportedPlatform){
        switch(supportedPlatform){
            case IOS: return new IOS_UIfactory();
            case ANDROID: return new Android_UIfactory();
        }
        return null;
    }
}