public class Shop {
    public static void main(String[] args) {
        Phone phone =  new PhoneBuilder()
                        .setOs("Android")
                        .setRam(512)
                        .setScreenSize(123)
                        .setProcessor("windows").getPhone();
        System.out.println(phone);
    }
}
