/*
 * Name: Lingxuan Kong
 * Email: lingxuan.kong14@gmail.com
 * Student ID: 957828
 * Github: kongpeter
 * Homepage: kongpeter.github.io
 * Copyright (c) 2019.
 */

import java.util.*;
public class TimerTest
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();// 实例化Timer类

        timer.schedule(new TimerTask()
        {
            public void run()
            {
                System.out.println("退出");
                this.cancel();
            }
        }, 5000);// 这里百毫秒

        System.out.println("This program will quit in 5 seconds");
    }
}
