package com.company;


public class Main {

    public static void main(String[] args) {
        String [] names  = new String[4];
//        String[] names = {"Баха", "Фаррух","Иван", "AnnA};
        names[0] = "Баха";
        names[1] = "Фаррух";
        names[2] = "Иван";
        names[3] = "AnnA";

        for (int i = 0;  i < names.length; i++) {
            switch (names[i]){
                case "Баха":
                    System.out.println("Доброе утро " + names[i]);
                    break;

                case "Фаррух":
                    System.out.println("Добрый день " + names [i]);
                    break;

                case "Иван":
                    System.out.println("Добрый вечер " + names [i]);
                    break;

                case "AnnA":
                    System.out.println("Assalom aleykum " + names[i]);
                    break;


            }

        }





    }
}
