package com.gla.Methods.Level_3;

class OTPGenerator {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static int[] generateTenOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) otps[i] = generateOTP();
        return otps;
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateTenOTPs(10);
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}

