package guru.springframework.spring5webapp.designpattern.HLD;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    /** Round robin load balancer **/
    private List<String> servers;
    private int currentIndex;

    public LoadBalancer(List<String>servers){
        this.servers=servers;
        this.currentIndex=0;
    }

    public String getNextServer(){
        String nextServer=servers.get(currentIndex);
        currentIndex= (currentIndex +1 )%servers.size();
        return nextServer;
    }

    public static void main(String[] args) {
        List<String> serverList=new ArrayList<>();
        serverList.add("Server-1");
        serverList.add("Server-2");
        serverList.add("Server-3");

        LoadBalancer loadBalancer=new LoadBalancer(serverList);

        for(int i=0;i<10;i++){
            String nextServer=loadBalancer.getNextServer();
            System.out.println("Request " + (i+1) + " : Routing to : "+ nextServer );
        }
    }
}
