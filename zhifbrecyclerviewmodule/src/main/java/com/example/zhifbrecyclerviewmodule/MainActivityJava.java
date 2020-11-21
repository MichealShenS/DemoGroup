package com.example.zhifbrecyclerviewmodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/9 9:23
 * Description:
 * <p>
 * 题目要求:<br>
 * 求N个数的最大公约数和最小公倍数。用C或C++或java或python语言实现程序解决问题。<br>
 * 1.程序风格良好(使用自定义注释模板)<br>
 * 2.提供友好的输入输出，并进行输入数据的正确性验证<br>
 * 类方法:<br>
 * 方法public static int gcd(int x, int y)是求两个数的最大公约数<br>
 * 方法public static int ngcd(List<Integer> target , int z) 是求n个数的最大公约数<br>
 * 方法public static int lcm (int x , int y)是求两个数的最小公倍数<br>
 * 方法public static int nlcm (List<Integer> target , int z)是自n个数的最小公倍数<br>
 */
class MainActivityJava {

    public static void main(String[] args) {
//        System.out.println("ssss");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        List<Integer> target = new ArrayList<>();
        System.out.println("------------------------------------------------------------");
        System.out.println("请输入需要计算最大公约数和最小公倍数的个数:");
        try {
            num = scanner.nextInt();
            System.out.println("请输入需要计算最大公约数和最小公倍数的数组:");
            for (int i = 0; i < num; i++) {
                target.add(scanner.nextInt());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入错误!!!");
            return;
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("最大公约数：" + ngcd(target, num));
        System.out.println("最小公倍数:" + nlcm(target, num));
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }

    /**
     * 辗转相除法的递归调用求两个数的最大公约数
     *
     * @param x 其中一个数
     * @param y 其中另一个数
     * @return 递归调用，最终返回最大公约数
     */
    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    /**
     * 求n个数的最大公约数
     *
     * @param target n个数的集合
     * @param z      数据个数
     * @return 递归调用，最终返回最大公约数
     */
    public static int ngcd(List<Integer> target, int z) {
        if (z == 1) {
            return target.get(0);
        }
        return gcd(target.get(z - 1), ngcd(target, z - 1));
    }

    /**
     * 辗转相除法的递归调用求两个数的最小公倍数
     *
     * @param x 其中一个数
     * @param y 其中另一个数
     * @return 递归调用，最终返回最小公倍数
     */
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    /**
     * 求n个数的最小公倍数
     *
     * @param target n个数的集合
     * @param z      数据个数
     * @return 递归调用，最终返回最小公倍数
     */
    public static int nlcm(List<Integer> target, int z) {
        if (z == 1) {
            return target.get(0);
        }
        return lcm(target.get(z - 1), nlcm(target, z - 1));
    }


}
