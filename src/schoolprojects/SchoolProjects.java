/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolprojects;

import util.MyToys;

/**
 *
 * @author KhoaPHD
 */
public class SchoolProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToys.cF(5)); //kì vọng 120
        System.out.println("6! = " + MyToys.cF(6)); //expected 720
        System.out.println("0! = " + MyToys.cF(0)); //expected 1
        System.out.println("Exception: " + MyToys.cF(-5));  //kì vọng
                                                            //bị chửi sấp mặt, bị ném vào mặt
                                                            //cái ngoại lệ, cà chớn
                                                            //JVM giết app
    }
    
}
