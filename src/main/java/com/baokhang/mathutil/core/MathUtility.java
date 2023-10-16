/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhang.mathutil.core;

/**
 *
 * @author PC
 */
//class nay la noi chua cac ham static dung lam thu vien cho cac class
public class MathUtility {
    public static final double PI =3.14;
    //public const double PI=3.14; c#
//    public static long getFactorial(int n){
//        if(n<0 || n>20)
//            throw  new IllegalArgumentException("Invalid n. n must be 0..20");
//        if(n==0 || n==1)
//            return 1;
//        long result =1;
//        for (int i = 2; i <= n; i++) {
//            result *=i;
//        }
//    
//        return result;
//    }
     public static long getFactorial(int n){
        if(n<0 || n>20)
           throw  new IllegalArgumentException("Invalid n. n must be 0..20");
      if(n==0 || n==1)
            return 1;
      return n* getFactorial(n-1);
     }
}
 //Dùng đệ quy 
 // KĨ THUẬT KIỂM THỬ GỌI LÀ : REGRESSION TESTING     
//                             KIỂM THỬ HỒI QUY -TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST
// TRONG THỰC TẾ LÀM DỰ ÁN       
// SỬA VÌ 
// FIX BUG THÌ PHẢI SỬA CODE 
// THÊM HÀM, THÊM TÍNH NĂNG 
// TỐI ƯU HÀM CŨ, LÀM HÀM CŨ GỌN HƠN, DỄ ĐỌC HƠN, CHẠY NHANH HƠN 
// HÀM ĐANG NGON, MÀU XANH 




     
