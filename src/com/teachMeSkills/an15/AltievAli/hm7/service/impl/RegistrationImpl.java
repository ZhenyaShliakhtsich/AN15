package com.teachMeSkills.an15.AltievAli.hm7.service.impl;

import com.teachMeSkills.an15.AltievAli.hm7.Registration;
import com.teachMeSkills.an15.AltievAli.hm7.service.RegistrationService;

import java.util.ArrayList;
import java.util.Scanner;


public class RegistrationImpl extends Registration implements RegistrationService {

    String getUserAnswer;
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public RegistrationImpl() {

    }

    @Override
    public void registration() {
        System.out.println("Welcome to registration page!");
        System.out.println("Enter first name");
        firstName = scanner.nextLine();
        if (firstName.length() <= 1) {
            System.out.println("Try again!First name must be minimum 2 characters.");
            registration();
        } else {
            arrayList.add(firstName);
        }
        System.out.println("Enter second name");
        secondName = scanner.nextLine();
        if (secondName.length() <= 1) {
            System.out.println("Try again!Second name must be minimum 2 characters.");
            registration();
        } else {
            arrayList.add(secondName);
        }
        confirmPassword();
        checkEmail();
        checkPhoneNumber();
        signIn();


    }


    @Override
    public void confirmPassword() {
        System.out.println("Enter password");
        password = scanner.nextLine();
        if (password.length() <= 4) {
            System.out.println("Try again!Password name must be minimum 5 characters.");
            password = scanner.nextLine();
            if (password.length() >= 4) {
                arrayList.add(password);
                System.out.println("Confirm password");
                String confirmPassword = scanner.nextLine();
                if (password.equalsIgnoreCase(confirmPassword)) {
                    System.out.println("Password confirmed!");
                } else {
                    System.out.println("Password not confirmed!Try again");
                    confirmPassword();
                }
            }


        } else {
            arrayList.add(password);
            System.out.println("Confirm password");
            String confirmPassword = scanner.nextLine();
            if (password.equalsIgnoreCase(confirmPassword)) {
                System.out.println("Password confirmed!");
            } else {
                System.out.println("Password not confirmed!Try again");
                registration();
            }
        }

    }

    @Override
    public void checkPhoneNumber() {
        System.out.println("Enter Phone Number");
        phoneNumber = scanner.nextLine();
        phoneNumber = phoneNumber.replaceAll("[^1-9-]", "");
        arrayList.add(phoneNumber);

    }

    @Override
    public void checkEmail() {
        System.out.println("Enter email");
        Email = scanner.nextLine();
        if (Email.length() <= 4) {
            System.out.println("Email must be minimum 5 characters");
            checkEmail();
        } else {
            arrayList.add(Email);
        }
    }

    @Override
    public void changeProfileInformation() {
        System.out.println("If you want to change Profile information enter word " + " Change");
        String changeProfile = scanner.nextLine();
        if (changeProfile.equalsIgnoreCase("Change")) {

            ArrayList<String> listOfOptions = new ArrayList<>();
            listOfOptions.add("1.Change fist name");
            listOfOptions.add("2.Change second name");
            listOfOptions.add("3.Change password");
            listOfOptions.add("4.Change phone number");
            listOfOptions.add("5.Change email");
            for (String list : listOfOptions
            ) {
                System.out.println(list);

            }

            System.out.println("Enter what do you want to change");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("Change first name")) {
                System.out.println("Enter new first name");
                String newFirstName = scanner.nextLine();
                if (newFirstName.length() <= 1) {
                    System.out.println("first name must contains minimum 2 symbols ");
                    changeProfileInformation();
                } else {
                    System.out.println("First name is updated");
                    arrayList.remove(0);
                    arrayList.add(0, newFirstName);
                    for (String s : arrayList
                    ) {
                        System.out.println(s);

                    }
                }
            } else if (userChoice.equalsIgnoreCase("Change second name")) {
                System.out.println("Enter new second name");
                String newSecondName = scanner.nextLine();
                if (newSecondName.length() <= 1) {
                    System.out.println("Second name must contains minimum 2 symbols");
                    changeProfileInformation();
                } else {
                    arrayList.remove(1);
                    arrayList.add(1, newSecondName);
                    System.out.println("SecondName is updated");
                    for (String s : arrayList
                    ) {
                        System.out.println(s);

                    }
                }
            } else if (userChoice.equalsIgnoreCase("Change password")) {
                System.out.println("Enter new password");
                String newPassword = scanner.nextLine();
                if (newPassword.length() <= 4) {
                    System.out.println("Try again!Password  must be minimum 5 characters.");
                    changeProfileInformation();
                } else {
                    arrayList.remove(2);
                    arrayList.add(2, newPassword);
                    System.out.println("Password is updated");
                    for (String s:arrayList
                         ) {
                        System.out.println(s);

                    }
                }

            } else if (userChoice.equalsIgnoreCase("Change email")) {
                System.out.println("Enter  new email");
                String newEmail = scanner.nextLine();
                if (newEmail.length() < 5) {
                    System.out.println("Try again!Email must be minimum 5 characters.");

                    changeProfileInformation();
                } else {
                    arrayList.remove(3);
                    arrayList.add(newEmail);
                    System.out.println("Email is updated");
                    for (String s : arrayList
                    ) {
                        System.out.println(s);

                    }

                }

            }
        } else {

            changeProfileInformation();
        }
    }

    @Override
    public void changeInfo() {

    }

    @Override
    public void showProfile() {

        System.out.println("If you want to see profile,enter word " + " Show profile");
        getUserAnswer = scanner.nextLine();
        if (getUserAnswer.equalsIgnoreCase("Show profile")) {
            for (String s : arrayList) {
                System.out.println(s);
            }
        } else {
            showProfile();
        }


    }

    @Override
    public boolean signIn() {
        System.out.println("Sign in.Enter email and password");
        String signInEmailOrFirstname = scanner.nextLine();
        if (signInEmailOrFirstname
                .equalsIgnoreCase(arrayList.get(3))) {
            System.out.println("Enter password");
            String signInPassword = scanner.nextLine();
            if (signInPassword.equals(arrayList.get(2))) {
                showProfile();
                changeProfileInformation();
            } else {
                System.out.println("Not correct Email and password");
                signIn();
            }
        } else {
            System.out.println("Not correct Email or password");
            signIn();
        }

        return false;

    }


}








