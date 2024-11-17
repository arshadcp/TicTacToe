package Singleton;

public class Singletonmain {
    public static void main(String[] args){
//        singleton s1=singleton.ton();
//        System.out.println(s1);
//        singleton s2=singleton.ton();
//        System.out.println(s2);
//        singleton s3=singleton.ton();
//        System.out.println(s3);
//        singleton s4=singleton.ton();
//        System.out.println(s4);
        DBComm d1=DBComm.database();
        System.out.println(d1);
        DBComm d2=DBComm.database();
        System.out.println(d2);
        DBComm d3=DBComm.database();
        System.out.println(d3);

    }
}
