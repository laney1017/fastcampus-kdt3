package me.day09.interfaces.polymorphism;

public class SmartTV extends Electronic implements SmartPhoneControllable {
    private int volume;
    private boolean isMute;

    @Override
    public void on() {
        System.out.println(GeneralRefrig.class.getName() + " on");
    }

    @Override
    public void off() {
        System.out.println(GeneralRefrig.class.getName() + " off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= RemoteControllable.MIN_VOLUME && volume <= RemoteControllable.MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("Can't Set That Volume ... Too High or Lower");
        }
        System.out.println(this.volume + " Volume ... ");
    }

    @Override
    public void toggleMute() {
        isMute = !isMute;
        System.out.println((isMute  ? "Mute" : "Unmute") + " Status ... ");
    }

    @Override
    public void changeBattery() {
        System.out.println(GeneralRefrig.class.getName() + " change battery...");
    }

    @Override
    public void listenVoice() {
        System.out.println(GeneralRefrig.class.getName() + " listening your voice...");
    }
}
