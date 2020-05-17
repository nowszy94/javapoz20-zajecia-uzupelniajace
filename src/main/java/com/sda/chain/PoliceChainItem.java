package com.sda.chain;

public class PoliceChainItem implements ChainItem {
    @Override
    public boolean test(String value) {
        return value.contains("police") || (value.contains("ambulance") && value.toLowerCase().contains("firefighters"));
    }

    @Override
    public void action(String value) {
        System.out.println("Calling to nearest police officers");
    }
}
