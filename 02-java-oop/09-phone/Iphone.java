public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here 
        
    }
    @Override
    public String unlock() {
        // your code here
    }
    @Override
    public void displayInfo() {
        // your code here            
    }
}