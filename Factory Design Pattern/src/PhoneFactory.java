public class PhoneFactory {
    public static void main(String[] args) {
       OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
       OS obj = operatingSystemFactory.getInstance("jshdgb");
       obj.spec();

    }
}
