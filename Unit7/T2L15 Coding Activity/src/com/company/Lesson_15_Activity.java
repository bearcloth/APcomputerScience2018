package com.company;

public class Lesson_15_Activity
{
    public static void sortAndPrint(String[] list)
    {
        for(int cur = 0; cur < list.length; cur++)
        {
            for(int i = cur; i < list.length ; i++)
            {
                if(list[i].compareTo(list[cur]) < 0)
                {
                    String tmp = list[i];
                    list[i] = list[cur];
                    list[cur] = tmp;
                }
            }
        }

        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
        sortAndPrint(list);
    }
}
