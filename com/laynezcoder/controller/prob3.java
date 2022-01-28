//package com.laynezcoder.controller;
//
//import java.util.ArrayList;
//
//public class prob3 {
//
//
//    public static void main(String[] args) {
//
//        String Data = "My name First last First\n" +
//                "My name First last First First First First\n" +
//                "awwfr arfqa ara \n" +
//                "arfar arar arar \n";
//       String part[] = Data.split("\n");
//        for (int i = 0; i <Data.split("\n").length;i++){
//
//            Found(part[i]);
//        }
//
//
//
//
//
//    }
//
//
//  static void Found(String Data){
//
//      ArrayList<Integer> array= new ArrayList<Integer>();
//      String[] part = Data.split(" ");
//      boolean isFound = false;
//      for (int i = 0; i < part.length; i++){
//
//          if(part[i].equals("First")){
//
//              array.add(i);
//
//              isFound= true;
//          }
//      }
//
//      if(isFound) {
//
//          System.out.println("Found " + array);
//      } else System.out.println("Not Found");
//
//
//}
//
//
//
//
//
//
//
//
//}
