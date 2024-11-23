package Observer;

import java.util.ArrayList;

public class Amazon {
    OrderPlacedSubscriber subscriber;
    private ArrayList<OrderPlacedSubscriber>sub;//maintain the list of subscribers
    public Amazon(){//constructor
        sub=new ArrayList<>();

    }
    public void Orderplaced(){//event
//       for(int i=0;i<sub.size();i++){
//           sub.get(i).Event();
//       }
        for(OrderPlacedSubscriber o:sub){
            o.Event();
        }
    }
    public void subscribe(OrderPlacedSubscriber subscriber){
        sub.add(subscriber);
    }
    public void unsubscribe(OrderPlacedSubscriber subscriber){
       sub.remove(subscriber);
    }
}
