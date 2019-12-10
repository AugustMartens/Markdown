package com.softdev.kuleuven;

import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        try {
            Connection C1 = new Connection();
            C1.postToDatabase("Hello is it me your looking for?");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
