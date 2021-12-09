public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Windows")
                .setProcessor("OS")
                .setRam(512)
                .setScreenSize(6.7)
                .setBattery("5200mhz")
                .getPhone();

        System.out.println(phone);

    }
}
