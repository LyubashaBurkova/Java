package com.company;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("Is Srart  = " + isStart);
        }

        public void shutdown (){
            isStart = false;
            System.out.println("Is Srart  = " + isStart);
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("Is Srart  = " + isStart);
        }

        public void shutdown (){
            isStart = false;
            System.out.println("Is Srart  = " + isStart);
        }
    }

    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}
