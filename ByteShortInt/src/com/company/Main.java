package com.company;

public class Main {

    public static void main(String[] args) {

    // Integer has a width of 32
    int myMinValue = -2147483648;
	int myMaxValue = 2147483647;
	int myTotal = (myMinValue/2);
    System.out.println("myTotal = " + myTotal);

	// Byte has a width of 8
	byte myMinByteValue = -128;
	byte myMaxByteValue = 127;
	byte myNewByteValue = (byte) (myMaxByteValue/3);
    System.out.println("myNewByteValue = " + myNewByteValue);

	// Short has a width of 16
	short myMinShortValue = -32768;
	short myMaxShortValue = 32767;
	short myNewShortValue = (short) (myMaxShortValue - 5212);
    System.out.println("myNewShortValue = " + myNewShortValue);

	// Long has a width of 64
    long myLongValue = 100L;
    }
}
