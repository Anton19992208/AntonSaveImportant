package com.Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);




        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 4);
        list.add(3, 5);
        list.add(4, 6);
        list.add(5, 7);
        list.add(6, 8);
        list.add(7, 9);

        list.remove(3);
        System.out.println(list);


        for (Integer integer : list) {
            System.out.println("number = " + integer);
        }





        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(arrayList);

        ArrayList<String> arrayList2 =
                new ArrayList<>(Arrays.asList("Petya", "Vasya"));
        System.out.println(arrayList2);


        ArrayList<String> months = new ArrayList<>();
        months.add("РЇРЅРІР°СЂСЊ");
        months.add("Р¤РµРІСЂР°Р»СЊ");
        months.add("РњР°СЂС‚");
        months.add("РђРїСЂРµР»СЊ");
        months.add("РњР°Р№");
        months.add("РСЋРЅСЊ");
        months.add("РСЋР»СЊ");
        months.add("РђРІРіСѓСЃС‚");

        System.out.println(months.size());

        months.set(1, "Р“РґРµРєР°Р±СЂСЊ");
        System.out.println(months);





        int b1 = months.indexOf("РњР°Р№");
        System.out.println(b1);

        boolean b2 = months.contains("РњР°СЂ");
        System.out.println(b2);

        Collections.swap(months, months.indexOf("РђРІРіСѓСЃС‚"),
                months.indexOf("РЇРЅРІР°СЂСЊ"));
        System.out.println(months);


        Collections.sort(months);
        System.out.println(months);

        Collections.reverse(months);
        System.out.println(months);

        months.clear();
        System.out.println(months);

        System.out.println(list.equals(months));

        String[] strArray = {"a", "b", "c", "e", "f"};
        ArrayList<String> arrayList1 =
                new ArrayList<>(Arrays.asList(strArray));
        System.out.println(arrayList1);


        String[] strArray1 = {"a", "b", "c", "e", "f"};
        boolean b = Arrays.asList(strArray1).contains("b");
        System.out.println(b);














    }}