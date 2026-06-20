public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1 channel: " + tv1.channel + " volume: " + tv1.volumeLevel);
        System.out.println("tv2 channel: " + tv2.channel + " volume: " + tv2.volumeLevel);
    }
}
