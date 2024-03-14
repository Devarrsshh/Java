package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MycellPhone{
    void callNumber (int phoneNumber){
        System.out.println("calling " + phoneNumber);
    }
    void pickcall (){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MycellPhone implements MyWifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "Prashanth", "devarsh"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}
    public class cwh_57_default_methods {
        public static void main(String[] args) {
            MySmartPhone ms = new MySmartPhone();
            ms.record4kVideo();
            String [] ar = ms.getNetworks();
            for(String item: ar){
                System.out.println(item);
            }
    }
}
