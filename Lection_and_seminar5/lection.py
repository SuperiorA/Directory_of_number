# def sum_str(*args):                       # Через переменную со звездочкой * мы можем передавать неограниченное количество аргументов
#     res = ''
#     for i in args:
#         res += i
#     return res

# print(sum_str('q', 'e', 'l'))
# print(sum_str('q', 'e', 'l', 's', 'k'))
# print(sum_str('1', '8', '9'))


# import modul                                # Импорт файла modul
# print(modul.max1(5, 9))                     # Вызов нужной нам функции из этого файла

# from modul import *                         # Импорт всех функций, содержащихся в файле modul

# import modul as m                           # Присваиваем сокращенное название файлу modul, в случае необходимости
# print(m.max1(10, 2))


# РЕКУРСИЯ:


# def fib(n):
#     if n in [1, 2]:                           # Присваиваем первым двум элементам значение 1
#         return 1
#     else:
#         return fib(n - 1) + fib(n - 2)        # Вычисляем последовательность ФИБО, начиная с 3 элемента, то есть n = 3
# list1 = []
# for i in range(1, 10):
#     list1.append(fib(i))
# print(list1)



# Сортировка через рекурсию

# def quick_sort(array):
#     if len(array) <= 1:
#         return array
#     else:
#         pivot = array[0]
#     less = [i for i in array[1:] if i <= pivot]              # Если число меньше pivot, то оно добавляется в список less
#     more = [i for i in array[1:] if i > pivot]               # Если число больше pivot, то оно добавляется в список more
#     return quick_sort(less) + [pivot] + quick_sort(more)

# print(quick_sort([14, 12, 423, 12, 3, 43]))



# Сортировка через разделение и слияние

# def merge_sort(nums):
#     if len(nums) > 1:
#         mid = len(nums) // 2
#         left = nums[:mid]                                    # Движемся от начала к середине
#         right = nums[mid:]                                   # Движемся от середины к концу
#         merge_sort(left)
#         merge_sort(right)
#         i = j = k = 0
#         while i < len(left) and j < len(right):
#             if left[i] < right[j]:
#                 nums[k] = left[i]
#                 i += 1
#             else:
#                 nums[k] = right[j]
#                 j += 1
#             k += 1
#         while i < len(left):
#             nums[k] = left[i]
#             i += 1
#             k += 1
#         while j < len(right):
#             nums[k] = right[j]
#             j += 1
#             k += 1

# list1 = [12,3,5,6]
# merge_sort(list1)
# print(list1)


# СЕМИНАР по РЕКУРСИИ

# Задача №1. Факториал числа n!

# n = int(input("Введите число "))

# def factor(n):
#     fact = 1                         # Задаём факториал 0
#     while n > 0:
#         fact *= n
#         n -= 1
#         factor(n)
#     return(fact)

# print(factor(n))

# ИЛИ

# def fac(n):
#     if n <= 0:
#         return 1
#     return n*fac(n-1)

# print(fac(n))




# Задача N2. 

# Последовательностью Фибоначчи называется последовательность чисел a0, a1, ..., an, ..., где
# a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1). Требуется найти N-е число Фибоначчи
# Input: 7 Output: 21
# Задание необходимо решать через рекурсию

# n = int(input())

# def fibo_value(n):
#     if n <= 2:
#         return 1
#     print(fibo_value(n-1) + fibo_value(n-2))
#     return fibo_value(n-1) + fibo_value(n-2)


# print(fibo_value(n))


# ЗАдача №3

# Дано натуральное число N и последовательность из N элементов. Требуется вывести эту последовательность в обратном порядке.
# Примечание. В программе запрещается объявлять массивы и использовать циклы (даже для ввода и вывода).
# Input: 2 -> 3 4 Output: 4 3


def reverse_string(n):
    if n <= 0:
        return '+'
    num = input(" Введите число ")
    return reverse_string(n-1) + ' ' + num

print(reverse_string(5))