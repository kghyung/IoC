package com.koreait.spring.basic;

public class Tv {
    private Speaker speaker;

    public Tv(Speaker speaker){
        this.speaker = speaker;
    }
    public void volumeUp(){
        //소리크기 : ?
        speaker.speakUp();
        printCurrentVolume();
    }

    public void volumeDown(){
        //소리크기 : ?
        speaker.speakDown();
        printCurrentVolume();
    }

    private void printCurrentVolume(){
        System.out.printf("소리크기 : %d\n",speaker.getVolume());
    }
}
