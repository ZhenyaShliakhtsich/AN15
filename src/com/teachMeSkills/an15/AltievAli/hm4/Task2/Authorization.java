package com.teachMeSkills.an15.AltievAli.hm4.Task2;


public class Authorization {

    public static void main(String[] args) {

        try {
            System.out.println(authorization("Aliллл66", "teachMeSkillsAN15", "teachMeSkillsAN15"));
            System.out.println(authorization("Ali6677777777777777777777777", "teachMeSkillsAN15", "teachMeSkillsAN15"));
            System.out.println(authorization("Ali666", "tezachMeSkillsAN16", "teachMeSkillsAN15"));
            System.out.println(authorization("Ali666", "tezfffffffffffachMeSkillsAN15", "tezfffffffffffachMeSkillsAN15"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static boolean authorization(String login, String password, String confirmPass) {


        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login is not correct!");
            }
            if (password.length() > 20 || !password.equals(confirmPass)) {

                throw new WrongPasswordException("Password in not correct!");

            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
