package com.company.ex39;

import com.company.MyList;

public class Main {

    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.listRandomFill(10, 1, 10);

        myList.listDisplay();

        myList.listRemoveLessThan(4);

        myList.listDisplay();

    };

}
