package InterviewPrep;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        System.out.println(getCredentialsMap().get("customer"));
    }

    public static HashMap<String,String> getCredentialsMap(){

        HashMap<String,String> userMap = new HashMap<>();
        userMap.put("customer","Ganesh Automation::Test@123");
        userMap.put("admin","arpit::123");
        userMap.put("distributor","gulmaz::12323");
        userMap.put("seller","chetna::chetna9090");
        userMap.put("deliveryGirl","greeshma");

        return userMap;
    }

}
