package com.infongen.selenium.example;


import java.time.DayOfWeek;


public class WhippingTest {

  static final String SAVE_LINK_ID = "a_save";
  static final String EXPORT_LINK_ID = "a_export";


  public static void main(String[] args) {

    System.out.println("DayOfWeek = " + DayOfWeek.FRIDAY.toString().substring(0,2));

    System.out.println("DayOfWeek = " + DayOfWeek.valueOf(DayOfWeek.FRIDAY.toString()));

    System.out.println("Ser = "  );
  }
}

