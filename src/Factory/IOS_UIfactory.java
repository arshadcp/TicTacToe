package Factory;

public class IOS_UIfactory implements UI_factory{
    public Menu createMenu(){
        return new ios_menu();
    }
    public Button createButton(){
        return new iosbutton();
    }
    public dropDown createDropdown(){
        return new ios_dropDown();
    }
}
