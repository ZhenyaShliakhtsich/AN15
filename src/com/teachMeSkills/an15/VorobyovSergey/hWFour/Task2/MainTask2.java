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
        boolean userConf = isUserConfirmed("Login", "QwertyЫ", "Qwerty");
        System.out.println("Shod we autorize this user? Answer - " + userConf);
    }

    static boolean isUserConfirmed(String login, String password, String confirmPassword) {
        //Password check first
        if (!password.equals(confirmPassword)) {
            return false;
        }

        String myRegEx = "[A-Za-z\\d\\_]{0,20}";

        //Если весь пароль из латински букв, то не возникнет ошибки
        try {
            if (!login.matches(myRegEx)) {
                throw new WrongLoginException();
            } else if (!password.matches(myRegEx) || !confirmPassword.matches(myRegEx)) {
                //избыточный вызов confirmPasswortd.matches
                //общая ошибка для некорректного пароля и для того что они не совпадают
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException | WrongPasswordException el) {
            el.printStackTrace();
            return false;
        }

        return true;
    }
}
