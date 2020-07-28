package com.study.out.backjoon;


import java.util.Scanner;

public class Main {

    private static char[][] map = new char[51][51];

    private static void swap(char [][] map, int i, int j, int toI, int toJ)
    {
        char temp = map[i][j];
        map[i][j] = map[toI][toJ];
        map[toI][toJ] = temp;
    }

    private static int check(char [][] map, int size)
    {
        int maxValue = 0;

        for (int i = 0; i < size; i++)
        {
            int cnt = 1;
            for (int j = 1; j < size; j++)
            {
                if (map[i][j-1] == map[i][j])
                {
                    cnt++;
                }
                else
                {
                    cnt = 1;
                }
                maxValue = Math.max(maxValue, cnt);
            }

            cnt = 1;
            for (int j = 1; j < size; j++)
            {
                if (map[j-1][i] == map[j][i])
                {
                    cnt++;
                }
                else
                {
                    cnt = 1;
                }
                maxValue = Math.max(maxValue, cnt);
            }

        }

        return maxValue;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            String str = sc.nextLine();

            for(int j = 0; j < str.length(); j++)
            {
                map[i][j] = str.charAt(j);
            }
        }

        int ret = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (j + 1 < n)
                {
                    swap(map, i, j, i, j+1);
                    ret = Math.max(check(map, n), ret);
                    swap(map, i, j, i, j+1);
                }

                if(i + 1 < n)
                {
                    swap(map, i+1, j, i, j);
                    ret = Math.max(check(map, n), ret);
                    swap(map, i+1, j, i, j);
                }
            }
        }

        System.out.println(ret);
    }
}
