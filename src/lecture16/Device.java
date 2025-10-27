package lecture16;

// Parent class
class Device
{

    public void powerOn()
    {
        System.out.println("Device is powering on");
    }

    public void powerOff()
    {
        System.out.println("Device is shutting down");
    }
}

// Child class
class Smartphone extends Device
{

    public void useApp()
    {
        System.out.println("Smartphone is running an app");
    }

    @Override
    public void powerOn()
    {
        System.out.println("Smartphone powers on with fingerprint");
    }
}