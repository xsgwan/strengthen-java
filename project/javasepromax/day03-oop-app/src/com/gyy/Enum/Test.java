package com.gyy.Enum;

public class Test {
    public static void main(String[] args) {
        // 目标: 认识枚举类
        // A.X = null;
        System.out.println(A.X);
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;

        System.out.println(a2.ordinal());
    }
}
