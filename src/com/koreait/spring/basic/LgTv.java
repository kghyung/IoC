package com.koreait.spring.basic;

public class LgTv extends Tv {

    public LgTv(){
        super(new HamanSpeaker());
        System.out.println(" ---- LgTv Created ---- ");
    }
}
