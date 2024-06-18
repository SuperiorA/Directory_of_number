# ЗАДАЧА №1.  
# Требуется вычислить, сколько раз встречается некоторое число k в массиве list_1.
# Найдите количество и выведите его.
# Пример:
# list_1 = [1, 2, 3, 4, 5]
# k = 3

# lists = [1, 2, 3, 4, 5, 3, 34, 4, 3, 34]
# k = 34
# count = 0
# for i in range (len(lists)):
#     if k == lists[i]:
#         count += 1
# print(count)


# ЗАДАЧА №2. 
# Требуется найти в массиве list_1 самый близкий по значению элемент к заданному числу k и вывести его.
# Считать, что такой элемент может быть только один. Если значение k совпадает с этим элементом - выведите его.
# Пример:
# list_1 = [1, 2, 3, 4, 5]
# k = 6
# 5

# amounts_lists = int(input())
# lists = [int(input()) for i in range(amounts_lists)]
# k = 9

# def close_digit(lists, k):
#     min_difference = 100
#     differnce = None
#     closes_digit = None
#     for amount in lists:
#         if k != amount:
#             differnce = abs(k - amount)                # Абсолютная величина, всегде положительная
#             if differnce < min_difference:
#                 min_difference = differnce
#                 closes_digit = amount
#         else:
#             return k
#     return closes_digit

# print(close_digit(lists, k))


# ЗАДАЧА №3.
# В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность.

# В случае с английским алфавитом очки распределяются так:
# A, E, I, O, U, L, N, S, T, R – 1 очко;
# D, G – 2 очка;
# B, C, M, P – 3 очка;
# F, H, V, W, Y – 4 очка;
# K – 5 очков;
# J, X – 8 очков;
# Q, Z – 10 очков.

# А русские буквы оцениваются так:
# А, В, Е, И, Н, О, Р, С, Т – 1 очко;
# Д, К, Л, М, П, У – 2 очка;
# Б, Г, Ё, Ь, Я – 3 очка;
# Й, Ы – 4 очка;
# Ж, З, Х, Ц, Ч – 5 очков;
# Ш, Э, Ю – 8 очков;
# Ф, Щ, Ъ – 10 очков.
# Напишите программу, которая вычисляет стоимость введенного пользователем слова k и выводит его. 
# Будем считать, что на вход подается только одно слово, которое содержит либо только английские, либо только русские буквы.
# Пример:
# k = 'ноутбук' = 12 очков

# k = input("Введите одно слово: ")
# k = k.upper()
# summary = 0
# first_set = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R', 'А', 'В', 'Е', 'И', 'Н', 'О', 'Р', 'С', 'Т'}
# second_set = {'D', 'G', 'Д', 'К', 'Л', 'М', 'П', 'У'}
# third_set = {'B', 'C', 'M', 'P', 'Б', 'Г', 'Ё', 'Ь', 'Я'}
# fourth_set = {'F', 'H', 'V', 'W', 'Y', 'Й', 'Ы'}
# fifth_set = {'J', 'X', 'Ш', 'Э', 'Ю'}
# six_set = {'Q', 'Z', 'Ф', 'Щ', 'Ъ'}
# seven_set = {'K', 'Ж', 'З', 'Х', 'Ц', 'Ч'}

# for i in range(len(k)):
#     if k[i] in first_set:
#         summary += 1
#     if k[i] in second_set:
#         summary += 2
#     if k[i] in third_set:
#         summary += 3
#     if k[i] in fourth_set:
#         summary += 4
#     if k[i] in fifth_set:
#         summary += 8
#     if k[i] in six_set:
#         summary += 10
#     if k[i] in seven_set:
#         summary += 5

# print(summary)