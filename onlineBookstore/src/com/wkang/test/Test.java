package com.wkang.test;

import com.wkang.untils.AESUntils;

public class Test {
    public static void main(String[] args) {
        String a = "wkang";
        String encrypt = AESUntils.encrypt(a, "123456");
        System.out.println(encrypt);

    }
}
