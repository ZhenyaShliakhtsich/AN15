package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task2;

//2. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//        Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//        Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
//        необходимо выбросить WrongLoginException.
//        Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//        Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
//        – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//        Обработка исключений проводится внутри метода.
//        Используем multi-catch block.
//        Метод возвращает true, если значения верны или false в другом случае.
class MainTask2 {
    public static void main(String[] args) {
        boolean userConf = isUserConfirmed("Login", "Qwerty", "Qwerty");
        System.out.println(userConf);
    }

    static boolean isUserConfirmed(String login, String password, String confirmPassword) {
        //Password check first
        if (!password.equals(confirmPassword)) {
            return false;
        }

        String myRegEx = "[A-Za-z\\d\\_]{0,20}";

        if (login.matches(myRegEx) &&
                password.matches(myRegEx) &&
                confirmPassword.matches(myRegEx)) {
            return true;
        } else {
            try {
                throw new Exception();
            } catch (WrongLoginException el){

            } catch (WrongPasswordException ep) {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return false;
    }
}
