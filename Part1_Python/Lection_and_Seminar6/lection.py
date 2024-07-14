# Задача N1.
# Напишите функцию, которая принимает одно число и проверяет, является ли оно простым
# Напоминание: Простое число - это число, которое имеет 2 делителя: 1 и n(само число)
# Input: 5 Output: yes

# value = int(input("Введите число "))

# def is_simple(value, delit = 2):
#     if delit * delit >= value:
#         return True
#     elif value % delit == 0:
#         return False
#     else:
#         return is_simple(value, delit + 1)
    
# print(is_simple(value, 2))


# Задача №2.
# Определить является ли паллиндромом введенное слово через рекурсию

# word = input("Введите слово ")

# def is_palli(word):
#     if word[0] != word[-1]:
#         return False
#     elif len(word) <= 2:
#         return True
#     return is_palli(word[1: -1])

# print(is_palli(word))


# Задача №3.
# Два различных натуральных числа n и m называются дружественными, если сумма делителей числа n
# (включая 1, но исключая само n) равна числу m и наоборот. Например, 220 и 284 – дружественные числа.
# По данному числу k выведите все пары дружественных чисел, каждое из которых не превосходит k. 
# Программа получает на вход одно натуральное число k, не превосходящее 100000. Программа должна вывести все
# пары дружественных чисел, каждое из которых не превосходит k. Пары необходимо выводить по одной в
# строке, разделяя пробелами. Каждая пара должна быть выведена только один раз (перестановка чисел новую пару не дает).
# Ввод:    Вывод:
# 300     220 284

k = int(input("Введите количество элементов: "))

for i in range(k):
    summa = 0
    sec_summa = 0
    for j in range(1, i // 2 + 1):                      # +1 для того, чтобы захватить последнее число от половины деления i
        if i % j == 0:
            summa += j
    for x in range(1, summa//2 + 1):
        if summa % x == 0:
            sec_summa += x
    if sec_summa == i and i < summa and summa < k:      # Условия i < summa отсекает повторяющиеся числа
        print(i, summa)


# ВТОРОЙ СПОСОБ ЧЕРЕЗ СПИСОК


# n = int(input())
# list_1 = list()
# for i in range(n):
#     summa = 0   
#     for j in range(1, i // 2 + 1):
#         if i % j == 0:
#             summa += j
#             list_1.append(tuple([i, summa]))         # Список, состоящий из кортежей(число и сумма его делителей)
# for i in range(len(list_1)):
#     for j in range(i, len(list_1)):
#         if i != j and list_1[i][0] == list_1[j][1] and list_1[i][1] == list_1[j][0]:
#             print(*list_1[i])