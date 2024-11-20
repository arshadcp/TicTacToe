package Prototype;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Registry {
    private HashMap<String, Student> Register;
    public Registry(){
        this.Register= new HashMap<>();

    }
    public void add(Student prototype){
        Register.put(prototype.getBatchName(), prototype);
    }
    public Student get(String batchName){
       return Register.get(batchName);
    }
}
