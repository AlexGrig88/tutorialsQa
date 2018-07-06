package ru.sbtqa.patterns.structural.adapter;

import ru.sbtqa.patterns.creational.factory.java8.User;

/**
 * @author Alexey Rumyantsev
 *
 * Legacy code ¯\_(ツ)_/¯
 */
public class SmsLoginUtils {
    public static void loginBySms(User user) {
        System.out.println("Call SmsLoginUtils loginBySms");
        /*TODO extract code from SMS server*/

        /*TODO login with temp SMS Code*/
    }
}
