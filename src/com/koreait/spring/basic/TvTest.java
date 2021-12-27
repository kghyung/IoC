package com.koreait.spring.basic;

public class TvTest {
    public static void main(String[] args) {

        /*현재 lgTv는 AppleSpeaker 사용하고 있다.
        그런데 HamanSpeaker 바꾸고 싶다면
        결국 소스를 수정해야한다.*/

        LgTv lgTv = new LgTv();
        SamsungTv samsungTv = new SamsungTv();

       /*
        for(int i=0; i<50; i++){
            lgTv.volumeUp();
        }
        System.out.println("--------------------------------------");
        for(int i=0; i<50; i++){
            lgTv.volumeDown();
        }
        */


    }
}
