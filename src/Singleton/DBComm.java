package Singleton;

public class DBComm {
    private int numberOfconnects=0;
    private final int Limit=10;
    public static DBComm db;
    private DBComm(){

    }
    public static DBComm database(){
        if(db==null){
            db=new DBComm();
        }
        return db;
    }
    public boolean Connect(){
        if(numberOfconnects<Limit){
           this.numberOfconnects++;
            return true;
        }
        else{
            return false;
        }
    }
}
