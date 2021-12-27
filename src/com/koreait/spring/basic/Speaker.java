package com.koreait.spring.basic;

public class Speaker {
    private int volume;
    private final int MAX_VOLUME;

    public Speaker(int max_volume){
        MAX_VOLUME = max_volume;
    }

    public void speakUp(){  //volume 1올리면 되는데 maxVolume 값보다 커지면 안된다.
        //volume++;
        if(volume < MAX_VOLUME){
            volume = volume + 1;
        }
    }

    public void speakDown(){  //volume 1올리면 되는데 maxVolume 값보다 작아지면 안된다.
        //volume--;
        if(volume > 0){
            // volume --;
            // volume = volume -1;
            volume -= 1;
        }
    }
    //volume Getter
    public int getVolume(){
        return volume;
    }
    //volume Setter
    public void setVolume(int volume){
        this.volume = volume;
    }
}
