# Задача №1.

# Напишите функцию same_by(characteristic, objects), которая проверяет, все ли объекты имеют одинаковое значение
# некоторой характеристики, и возвращают True, если это так. Если значение характеристики для разных объектов
# отличается - то False. Для пустого набора объектов, функция должна возвращать True. Аргумент characteristic - это
# функция, которая принимает объект и вычисляет его характеристику.
# Ввод: 
# Вывод:


# Решение для интового списка!


# values = [0, 2, 10, 6]                          
# def same_by(characteristic, objects):
#     for i in objects:
#         if all(i % 2 == 0 for i in objects):
#             return True
#         return False

# if same_by(lambda x: x % 2, values):
#     print(True)
# else:
#     print(False)


# Решение для стрингового списка!

# values = '8 5 77 -14 101 45'
# values = values.split()
# values = list(map(int, values))                 # Перевод списка строк в список чисел
# print(values)                         

# def same_by(characteristic, objects):
#     for i in objects:
#         if all(i % 2 == 0 for i in objects):
#             return True
#         return False

# if same_by(lambda x: x % 2, values):
#     print('same')
# else:
#     print('different')



# Задача №2.



# Напишите программу, которая подсчитает и выведет сумму квадратов всех двузначных чисел, делящихся на 9.
# При решении задачи используйте комбинацию функций filter, map, sum.
# Обратите внимание: на 9 должно делиться исходное двузначное число, а не его квадрат.

# is_delete_9_sum = sum([i*i for i in range(18, 100) if i % 9 == 0])
# print(is_delete_9_sum)



# Задача №3


# print(r"C:\WINDOWS\System32\drivers\etc\nst")  # прибавка к принту r - выводит в консоль то, что видит в строке, игнорируя переносы \n