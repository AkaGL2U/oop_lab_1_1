package com.company;

class Program
{
    static void Main(String[] args)
    {
        //Вывести на экран сумму чисел массива с помощью циклов for, while и do-while
        int[] array = {3,6,8,4,9}; //Инициализация одномерного массива на 5 целочисленных элементов
        System.out.println("Элементы массива до сложения: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(array[i] + " ");
        }
        System.out.println();//Перемещение строки консоли для удобства восприятия вывода

        int summ = 0;//Инициализация технической переменной для вывода результата сложения элементов массива
        for (int i = 0; i < 5; i++)
        {
            summ += array[i];//Присвоение с сложением
        }
        System.out.println("Вывод результата сложения элементов массива с помощью цикла for: {summ}");//форматированный вывод после использования цикла for
        summ = 0;//зануление технической переменной
        int check = 0;//инициализация технической переменной для обращения к элементам массива и подсчета циклов обращений
        while (check < 5)
        {
            summ += array[check];//Присвоение с сложением
            check++;
        }
        System.out.println("Вывод результата сложения элементов массива с помощью цикла while: {summ}");//форматированный вывод после использования цикла while
        summ = 0;//зануление технической переменной
        check = 0;//зануление технической переменной
        do
        {
            summ += array[check];//Присвоение с сложением
            check++;
        }
        while (check < 5);
        System.out.println("Вывод результата сложения элементов массива с помощью цикла do-while: {summ}");//форматированный вывод после использования цикла do-while
        //Delay
        //Console.ReadKey();
    }
}
