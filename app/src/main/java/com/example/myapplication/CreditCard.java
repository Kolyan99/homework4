package com.example.myapplication;

import android.accounts.Account;

public class CreditCard {

    public static void main(String[] args) {

        CreditCard1 creditCard = new CreditCard1(123687825, 1200);
        CreditCard1 creditCard2 = new CreditCard1(125265486, 900);
        CreditCard1 creditCard3 = new CreditCard1(114287562, 1600);
        creditCard.chargemoney();
        creditCard3.withdrawmoney();
        creditCard.cardinformation();
    }
}
    class CreditCard1 {

        int Account;
        int initial;
        public CreditCard1(int Account, int initial) {
            this.Account = Account;
            this.initial = initial;
        }

        public CreditCard1( char initial_to, int Account_to ) {
            this.Account = Account_to;
            this.initial = initial_to;
        }
        public CreditCard1(int Account_tree, char initial_tree) {
            this.Account = Account_tree;
            this.initial = initial_tree;
        }
            void chargemoney() {
            int enrollment=50;
            int enrollment2=100;
                System.out.println("Пополнение первой карты  "  +  enrollment );
                System.out.println("Пополение второй карты  " + enrollment2);
            }
            void withdrawmoney(){
            int withdrawal = 70;
                System.out.println("Снятие с третьей карты " +  withdrawal);
            }
            void cardinformation(){
                int enenrollment =50;
                int enrollment2=100;
                int withdrawal = 70;
                System.out.println("Баланс  первой карты " + (initial + enenrollment));
                char initial_to = 900;
                System.out.println("Баланс воторой карты " + ( initial_to + enrollment2  ));
                char initial_tree = 1600;
                System.out.println("Баланс третьей карты " + (initial_tree - withdrawal));
            }
    }




