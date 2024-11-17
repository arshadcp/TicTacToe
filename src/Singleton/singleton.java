package Singleton;

public class singleton {
    public static singleton single;
    //object type singleton and the object is stored in single
    private singleton(){//constructor

    }
    public static singleton ton(){
        if(single==null){//create object
            single=new singleton();
        }

            return single;

    }
}
