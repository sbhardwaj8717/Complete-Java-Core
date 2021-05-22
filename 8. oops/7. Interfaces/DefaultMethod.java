interface Camera{
    void takeSnap();
    void recordVideo(); 
    default void playMusic(){
        System.out.println("playing the music...");
    }
    default void message(){
        System.out.println("Default methods has no need to be override....but can be override");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}


class CellPhone {
    void callNumber(){
        System.out.println("Calling...");
    }
    
    public void pickCall(){
        System.out.println("connecting...");
    }
    
}

class SmartPhone extends CellPhone implements Wifi,Camera{
    
    @Override
    public void takeSnap(){
        System.out.println("taking snap...");
    }

    @Override
    public void recordVideo(){
            System.out.println("Recording the video...");
    }
    
    @Override
    public String[] getNetworks(){
        System.out.println("Getting the network list...");
        String allNetworks[] = {"Code", "In" , "Java" , "Is", "Love"};
        return allNetworks;
    }

    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network +"...");
    } 

    @Override
    public void message(){
        System.out.println("Yes we can override this method too...XD :)");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();

        String[] getNetwork = samsung.getNetworks();
        for (String string : getNetwork) {
            System.out.println(string);
        }

        samsung.playMusic();
        samsung.message();

    }    
}
