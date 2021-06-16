package com.company.ex40;

import com.company.MyList;

public class Main {

    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.listRandomFill(10, 1, 10);

        myList.listDisplay();

        myList.listRemoveAllDuplicates();

        myList.listDisplay();

    }



}
