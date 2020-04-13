/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author KhoaPHD
 */
public class MyToys {
    //Bộ thư viện các hàm xài chung, cho nên chúng là static
    
    //cF: compute factorial, tính n giai thừa n! = 1.2.3.....n
    //0! = 1
    //n! tăng nhanh, để kiểu long đỡ
    public static long cF(int n) {
        if (n < 0 || n > 15)
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        if (n == 0)
            return 1;
        //phần còn lại là hợp lệ, tính bình thường
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
