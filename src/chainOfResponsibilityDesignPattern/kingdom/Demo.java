package chainOfResponsibilityDesignPattern.kingdom;

import chainOfResponsibilityDesignPattern.kingdom.client.Client;
import chainOfResponsibilityDesignPattern.kingdom.client.King;
import chainOfResponsibilityDesignPattern.kingdom.request.Request;
import chainOfResponsibilityDesignPattern.kingdom.request.RequestType;

public class Demo {
    public static void main(String [] arr){
        Client king = new King();

        king.makeRequest(new Request(RequestType.COLLECT_TAX,"Collect the tax for people"));
        king.makeRequest(new Request(RequestType.LEAD_WAR,"Wage War against another kingdom"));
        king.makeRequest(new Request(RequestType.SAFETY_RULES,"Form new Safety Rules"));
        king.makeRequest(new Request(RequestType.PUNISH_CULPRIT,"Give appropriate punishment to the culprit"));
        king.makeRequest(new Request(RequestType.WATER_HYGIENE,"Monitor the Water hygiene in the kingdom"));
        king.makeRequest(new Request(RequestType.WATCH_GATE,"Watch all entrance gates to the kingdom"));
    }
}
