package Factory;

public class Flutter {
     public SupportedPlatform supportedPlatform;
     public Flutter(SupportedPlatform supportedPlatform){//constructor

         this.supportedPlatform=supportedPlatform;
     }
     public void setTheme(){
         System.out.println("Theme is set");

     }
     public void setRefreshrate(){
         System.out.println("Refreshrate is set");
     }
     public void createDropdown(){

         System.out.println("drop down is created");
     }
     public UI_factory createFactory(){
        return UIFactoryFactory.getFactory(supportedPlatform);
     }
}
