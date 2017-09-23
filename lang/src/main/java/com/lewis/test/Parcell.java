package com.lewis.test;

/**
 * Created by lewis on 17/9/23.
 */
public class Parcell {

   public static class Content {
        private int i ;

        public int value() {
            return i;
        }
    }


  private  class Destionation {
        private String display;

        Destionation(String s) {
            display = s;
        }

        public String display() {
            return display;
        }
    }


    public Content content() {
        return new Content();
    }

    public Destionation destionation(String display) {
        return new Destionation(display);
    }

    public static void main(String[] args) {
        Parcell pc = new Parcell();
        Content content = pc.content();
        Destionation destionation = pc.destionation("xx");
    }
}
