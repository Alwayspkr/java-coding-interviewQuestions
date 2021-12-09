public class OperatingSystemFactory {

    public OS getInstance(String str){

        if(str.equals("Open"))
            return new Android();

        else if(str.equals("closed"))
            return new Windows();
        else
            return new Iphone();

    }
}
