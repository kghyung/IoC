package com.koreait.spring.basic;

public class SamsungTv extends Tv {
    public SamsungTv(){
        super(new AppleSpeaker());
        System.out.println(" ---- SamsungTv Created ---- ");
    }


}
