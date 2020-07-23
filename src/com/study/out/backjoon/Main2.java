package com.study.out.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i =0 ;i < 9;i++)
        {
            int temp = sc.nextInt();
            list.add(temp);
        }

        Collections.sort(list);
        IntStream intStream = list.stream().mapToInt(s->s);
        int sum = intStream.sum();

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size(); j++)
            {
                if ((sum - list.get(i) - list.get(j)) == 100)
                {
                    for (int k = 0; k < list.size(); k++)
                    {
                        if(i == k || j == k) continue;
                        System.out.println(list.get(k));
                    }
                    return;
                }
            }
        }
    }
}
