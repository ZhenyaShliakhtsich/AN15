package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task2;

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
    // лучше статик и вверх вынести!!!
    static String myRegEx = "[A-Za-z\\d\\_]{0,20}";

    public static void main(String[] args) {
        boolean userConf = isUserConfirmed("Login!", "Qwerty", "Qwerty");
        System.out.println("Shod we autorize this user? Answer - " + userConf);
    }

    static boolean isUserConfirmed(String login, String password, String confirmPassword) {
        //Если весь пароль из латински букв, то не возникнет ошибки. Это один из вариантов был!!!
        try {
            if (!login.matches(myRegEx)) {
                throw new WrongLoginException();
            } else if (!password.matches(myRegEx) ||
                    !confirmPassword.matches(myRegEx) ||
                    !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            //Два catch, так и только так как в первом варианте!!!
            //Потому что иначе мы не сможем вызвать разные методы getErrorMessage() для пусных конструкторов
            //Или менять задание или менять замечание или менять подход к решению!!!
        } catch (WrongLoginException el) {
            el.getErrorMessage();
            return false;
        } catch (WrongPasswordException ep) {
            ep.getErrorMessage();
            return false;
        }

        return true;
    }
}
