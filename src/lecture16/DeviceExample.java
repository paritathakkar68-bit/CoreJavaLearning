package lecture16;

// Main class
public class DeviceExample
{
    public static void main(String[] args)
    {

        Device device = new Device();
        device.powerOn();
        device.powerOff();

        System.out.println("------------");

        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.powerOff();
        phone.useApp();

        System.out.println("------------");

        Device devRef = new Smartphone();
        devRef.powerOn();
        devRef.powerOff();
        // devRef.useApp(); //  Not allowed directly via parent reference
    }
}
