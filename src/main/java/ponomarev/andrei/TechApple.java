package ponomarev.andrei;

public class TechApple {
    public static void main(String[] args) {

        Ipad ipad = new Ipad();
        ipad.addIpad("Ipad 10.2");
        ipad.addIpad("Ipad mini");
        ipad.printAllIpad();
        ipad.removeIpad("Ipad mini");
        ipad.printAllIpad();
        ipad.removeAllIpad();

        Watch watch = new Watch();
        watch.addWatch("Apple Watch 7", "42mm");
        watch.addWatch("Apple Watch 8", "44mm");
        watch.printAllWatch();
        watch.removeWatch("Apple Watch 7");
        watch.printAllWatch();
        boolean res = watch.hasWatch("Apple Watch 8", "44mm");
        System.out.println(res);

        Iphone iphone = new Iphone();
        iphone.addIphone("Iphone 14");
        iphone.addIphone("Iphone 14 pro Max");
        iphone.deleteIphone("Iphone 14");
        iphone.printIphone();

    }

}
