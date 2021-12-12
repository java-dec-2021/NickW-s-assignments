public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!" );
        Iphone iphoneTen = new Iphone("x", 100, "AT&T", "The Best");

        s9.displayInfo();
        System.out.println(s9.Ring());
        System.out.println(s9.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.Ring());
        System.out.println(iphoneTen.unlock());


    }
        
}
