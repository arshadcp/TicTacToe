package Factory;

public class Android_UIfactory implements UI_factory{
    public Menu createMenu(){
        return new Android_menu();//returning object of Android_menu class
    }
    public Button createButton(){

        return new Androidbutton();
    }
    public dropDown createDropdown(){

      return new Android_dropDown();
      //returning object of Android_dropDown class
    }
}
