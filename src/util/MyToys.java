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

//Mọi đoạn code bạn viết ra, phải cố gắng đảm bảo rằng nó có chất lượng
//Chất lượng nghĩa là: hàm trả về, xử lí đúng như mình dự kiến, kì vọng
//expected
//Ví dụ tính giai thừa() thì ta đưa vào 5, hy vọng nhận về 120
//Vậy ta phải chuẩn bị bộ dữ liệu để test từng hàm, đảm bảo nó xử lí đúng
//Từng hàm xử lí đúng -> Class xử lí đúng
//Việc đảm bảo cho từng class/module/đơn thể/từng hàm chạy như
//dự kiến -> DEV CÓ TRÁCH NHIỆM VỤ NÀY, VIỆC NÀY SONG SONG VỚI VIẾT CODE
//QUÁ TRÌNH NÀY ĐƯỢC GỌI LÀ UNIT TESTING
//Làm sao test hàm() chạy đúng không
//Chuẩn bị data -> đưa data -> gọi hàm() -> nhìn kết quả -> so với dự kiến -> kết luận
//Nhìn kết quả: mắt (nhìn con số trả ra, so với con số mong đợi)
//              nhìn bằng màu, số trả ra khớp với số mong đợi -> XANH
//                                       không khớp -> ĐỎ
//mắt -> sout(), JOptionPane, Popup, Log, xem luận anh hùng, luận kết quả
//màu -> JUnit, TestNG, xUnit, NUnit, CPPUnut, PHPUnit,...
//       bộ thư viện, .dll, .jar, giúp chúng ta luận theo màu
