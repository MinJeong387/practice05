package com.javaex.ex06;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate;
        // CConverter라는 class의 rate 변수가 무엇을 뜻하는지 알려줌
        // 따라서 아래 method 에서부터는 CConverter라는 class의 rate 변수를 쓸 수 있게됨
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
