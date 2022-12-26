package Services;

import java.util.ArrayList;
import java.util.List;

public class ServicesFactory {
    ServicesFactory(){}

    private List<String> Services  = new ArrayList<String>();


    public List<String> getServices() {
        return Services;
    }


    public void setServices(String service) {
        Services.add("DONATION");
        Services.add("INTERNET");
        Services.add("LANDLINE");
        Services.add("MOBILE RECHARGE");
        Services.add(service);

    }
    public void search(String s){
        for (String i : Services) {
            String search=s.toUpperCase();
            if (search==i) {
                System.out.println(" Matched services =>"+i );

            } else {

                System.out.println("No such a matching service ");

            }

        }


    }



}
