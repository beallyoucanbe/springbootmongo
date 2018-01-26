package com.shuoyi.repositories;

import java.io.*;

/**
 * Created by zhaosy-c on 2017/9/28.
 */
public class Test {


    public static void main(String[] args) throws IOException {
        System.out.println("123");
        String path = "C:/Users/zhaosy-c/Desktop/新建文本文档.txt";
        File file = new File(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        String line = " ";
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] infos = line.split("\t");
            for (int i = 1; i < infos.length; i++) {
                if (Integer.parseInt(infos[i]) > 1000){
                    System.out.println(line);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
