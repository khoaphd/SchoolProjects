/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;   //lát hồi xài hàm static không cần MyToys
                                //gọi cF() như bên C, không chấm

/**
 *
 * @author KhoaPHD
 */
public class MyToyTest {
    
    public MyToyTest() {
    }
    
    //Trong đây sẽ là những tình huống mình test hàm cần test (test cases)
    //Ví dụ ta test tình huống đưa vào ngon lành, nhận về ngon lành
    //Ví dụ ta test tình huống đưa vào cà chớn, nhận về Exception
    //Đảm bảo những tình huống này chạy như dự kiến/mong đợi/expected
    //Lúc đó NetBeans ném màu xanh khi ổn, đỏ khi có vấn đề
    
    @Test
    public void testSuccessfulCases() {
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));   //đỏ xảy ra 2 tình huống
                                    //hoặc bạn xử lí sai
                                    //hoặc bạn kì vọng sai
                                    //có đỏ, kiểm tra code
    }
    
    //Ngoại lệ Exception là 1 thứ không phải là value để ước lượng
    //Vậy thì không thể assert được, vì nó cần phải có value để so sánh
    //Xài thêm kĩ thuật bắt ngoại lệ, coi ngoại lệ xảy ra giống
    //như mình kì vọng không
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases() {
        //Không có value để assert do hàm cF() ném ra ngoại lệ
        cF(-5);
        cF(100);
    }
}

//Code không bị lỗi cú pháp, tham chiếu thư viện, luôn Clean And Build ra file jar
//Test dùng mắt, màu, câu chuyện của logic trong code, chứ không phải là câu chuyện của build jar
//Build jar, .java -> .class, nén .class thành .jar
//Tiềm ẩn rủi ro lớn, code sai logic, không sai cú pháp
//Nâng cao, nếu sai logic, đang màu đỏ -> không cho ra .jar
//JUnit đều kết hợp được với Ant để cấm App ra đời nếu còn màu đỏ