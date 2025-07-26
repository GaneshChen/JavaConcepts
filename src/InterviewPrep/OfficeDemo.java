package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OfficeDemo {

    public static void search(){

        List<String> ListboxXpathContainsLabels =  new ArrayList<>();
        ListboxXpathContainsLabels.clear();

        List<String> EditboxXpathContainsLabels = new ArrayList<>();
        EditboxXpathContainsLabels.clear();

        Collections.addAll(ListboxXpathContainsLabels,"Search Field","Operator");
        Collections.addAll(EditboxXpathContainsLabels,"SearchValue");

        System.out.println(ListboxXpathContainsLabels);
        System.out.println(EditboxXpathContainsLabels);

        String SearchCriteria = "NumberOfSearchCriteria==1\n" +
                "AdvancedSearchValues_1:\n" +
                "Search Field==Tracker ID\n" +
                "SearchValue==RunTime##TC_01_Create_New_Bid_Request##NSTD_TrackerID\n" +
                "##END##\n" +
                "Action==GLS Proposal\n" +
                "##END##";

        String split[];

        split = SearchCriteria.split("\\n");

        for(int i=0 ; i< split.length; i++){
            String keyvaluesplit[];
            String key="", value="", existingvalue="";
            keyvaluesplit = split[i].split("==");
            key=keyvaluesplit[0].trim();
            System.out.println("Key is :"+key);
            if(keyvaluesplit.length>1){
                value = keyvaluesplit[1].trim();
                System.out.println("Value is :"+value);
            }

            if(key.equals("NumberOfSearchCriteria")){
                List<String> searchvalues = new ArrayList<>();
                int  NumberOfsearchrows = Integer.parseInt(value);
                for(int k=0; k<NumberOfsearchrows; k++){
                    int l = k+1;
                    System.out.println("The Value of L is: "+ l);
                    if(l!=1){
                        System.out.println("Add Row");
                    }

                    searchvalues.clear();
                    if(SearchCriteria.contains("AdvancedSearchValues_")){
                        searchvalues = getValuesinbetweentwolines(SearchCriteria,"AdvancedSearchValues_"+l, "##END##");
                    }

                    for(int c=0; c< searchvalues.size(); c++){
                        String Currkeyvaluesplit[];
                        String Currkey="", Currvalue = "";
                        Currkeyvaluesplit = searchvalues.get(c).split("==");
                        Currkey = Currkeyvaluesplit[0].trim();
                        System.out.println("The Curr Key is :"+ Currkey);
                            if(Currkeyvaluesplit.length>1){
                                Currvalue = Currkeyvaluesplit[1].trim();
                                System.out.println("The Curr Value is :" + Currvalue);
                            }

                    }
                }
            }
        }

    }

   public static List<String> getValuesinbetweentwolines(String FullData, String Startingline, String EndingLine){

        List<String> resultlist = new ArrayList<>();
        String split[];
        boolean started= false;
       System.out.println("The Full Data is: "+ FullData);
        split = FullData.split("\\n");
        for(int i=0 ; i< split.length ; i++){
            if(split[i].trim().contains(Startingline.trim()) || started){
                started=true;

                if(split[i].trim().contains(EndingLine.trim())){
                    break;
                }
                    resultlist.add(split[i]);
            }
        }
            if(resultlist.size()>0)
                resultlist.remove(0);

       System.out.println("The ResultList is : "+ resultlist);
        return resultlist;
    }
    public static void main(String[] args) {
        search();
    }


}
