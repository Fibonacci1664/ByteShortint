package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        //Byte has a width of 8.
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        System.out.println("myNewbyteValue = " + myNewByteValue);

        //Short has a width of 16.
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMaxShortValue / 2);

        //Int has a width of 32.
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        /*Long has the width of 64, its max value it 2^63 (2 to the power of 63)
        and it min value would be the negative version of that same number plus 1.
        MaxValue = 9_223_372_036_854_775_807L
        MinValue = -9_223_372_036_854_775_808L*/
        long myLongValue = 100L;

        //Challange

        byte challangeByteValue = 10;
        short challangeShortValue = 20;
        int challangeIntValue = 50;

        long challangeLongTotal = 50000L + challangeByteValue * 10 + challangeShortValue + challangeIntValue;
        System.out.println("challangeLongTotal = " + challangeLongTotal);
    }
}
