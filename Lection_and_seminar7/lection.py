# def f(x):
#     return x*x

# a = f                             # Переменная а работает как ссылка на фнкцию f(x)
# print(a(6))
# print(f(6))


# Калькулятор:

# def calc1(a, b):
#     return a + b

# ЛЯМБДА - ФУНКЦИЯ a + b

# calc1 = lambda a, b: a + b        # Сокращение функции со строк 11-12 до одной строки

# def calc2(a, b):
#     return a * b

# def math(op, x, y):               # op - хранит ссылку на одну из функций
#     print(op(x, y))               # здесь мы выводим в консоль результат фукции от аргумента (х)

# math(calc1, 5, 20)
# math(lambda a, b: a + b, 5, 30)   # Ликвидация строки 16 и замена на прямой вызов аргументаов


# ЗАДАЧА 1. В списке хранятся числа. Нужно выбрать только чётные числа и составить список пар
# (число; квадрат числа).
# Пример: 1 2 3 5 8 15 23 38
# Получить: [(2, 4), (8, 64), (38, 1444)]

# lists = [3, 4, 6, 7, 8, 9, 4, 20]

# def digit(lists):
#     result = list()
#     for item in lists:
#         if item % 2 == 0:
#             result.append((item, item**2))
#     return result
# print(digit(lists))


# ВАРИАНТ РЕШЕНИЯ №2


# def select(f, col):                                # == map()
#     return [f(x) for x in col]                     # Возвращает список, к которому мы к каждому элементу применили функцию f(x)

# def where(f, col):                                 # == filter()
#     return [x for x in col if f(x)]                # Возврат только тех значений, которые прошли проверку условия f(x)

# lists = [3, 4, 6, 7, 8, 9, 4, 20]
# # result = where(lambda x: x % 2 == 0, lists)      # Получаем тольок четные элементы списка
# result = list(filter(lambda x: x % 2 == 0, lists)) # Заменяем функцию where на встроенную функцию filter, так как filter и есть where
# print(result)
# # result = select(lambda x: (x, x**2), result)     # Просим вернуть результат, состоящий из кортежа
# result = list(map(lambda x: (x, x**2), result))    # Заменяем функцию select на встроенную функцию map(), так как map() и есть select
# print(result)


# Функция map() - функция, которая проходится по каждому элемента массива, применяя к ним заданную фуекцию


# list1 = [x for x in range(1, 20)]
# print(list1)
# list1 = list(map(lambda x: x + 10, list1))
# print(list1)


# ЗАДАЧА №2

# C клавиатуры вводится некий набор чисел, в качестве разделителя используется
# пробел. Этот набор чисел будет считан в качестве строки. Как превратить list строк в list чисел?

# data = '3 4 5 6 78 89 654 2'
# print(data)
# # data = data.split()                   # Преобразование строки в список строк
# # print(data)
# data = list(map(int, data.split()))     # Преобразование строки сразу в числовой список
# print(data)


# Функция filter() - Возврат только тех значений, которые прошли проверку условия f(x), фильтрует списки и прочее


# data = [2, 6, 65, 175, 8]
# res = list(filter(lambda x: x % 10 == 5, data))
# print(res)


# Функция zip() - применяется к набору итерируемых объектов и возвращает кортежи из элементов одного индекса. 
# Например все элементы с индексом 0. Функция zip () всегда пробегает по МИНИМАЛЬНОМУ входящему набору элементов.

# users = ['user1', 'user2', 'user3', 'user4', 'user5']
# ids = [4, 5, 9, 14, 7]
# data = list(zip(users, ids))
# print(data)                                # [('user1', 4), ('user2', 5), ('user3', 9), ('user4', 14), ('user5', 7)]


# Функция enumerate() - позволяет пронумеровать набор данных. Возвращает кортежи из элементов и их индексов

# users = ['user1', 'user2', 'user3']
# data = list(enumerate(users))
# print(data)                                # [(0, 'user1'), (1, 'user2'), (2, 'user3))]


# РАБОТА С ФАЙЛАМИ

# colours = ['red', 'green', 'blue']
# data = open('file.txt', 'a')             # указываем режим, в котором будем работать, а - дописывает в файл инфу
# data.writelines(colours)                 # удаляем разделители в текстовом файле file.txt
# data.close()                             # если открываешь файл, то обязательно должен его закрыть этой командой
# exit() — позволяет не выполнять код, прописанный после этой команды в скрипте.



# Вариант работы с перезаписью файла!

# with open('file.txt', 'w') as data:        # w - перезаписывает инфу в файле
#     data.write('line 1 \n')                # \n - перенос на новую строку
#     data.write('line 3 \n')

# Вариант работы с чтением файла!

# path = 'file.txt'
# data = open(path, 'r')
# for line in data:
#     print(line)
# data.close()



# Встроенный модель os

# import os

# Базовые функции данного модуля:

# os.chdir(path)                                                                 # смена текущей директории.
# os.chdir('C:/Users/79190/PycharmProjects/GB')

# os.getcwd()                                                                    # текущая рабочая директория
# print(os.getcwd() + '- вот она') # 'C:\Users\79190\PycharmProjects\webproject'

# os.path.basename(path)                                                         # базовое имя пути
# print(os.path.basename('C:/Users/79190/PycharmProjects/main.py')) #'main.py'

# os.path.abspath(path)                                                          # возвращает нормализованный абсолютный путь.
# print(os.path.abspath('main.py')) # 'C:/Users/79190/PycharmProjects/webproject/main.py'



# Модуль shutil

# Модуль shutil содержит набор функций высокого уровня для обработки файлов, групп файлов, и папок. В частности,
# доступные здесь функции позволяют копировать, перемещать и удалять файлы и папки. Часто используется вместе
# с модулем os.

# import shutil

# Базовые функции данного модуля:

# shutil.copyfile(src, dst) - копирует содержимое (но не метаданные) файла src в файл dst.

# shutil.copy(src, dst) - копирует содержимое файла src в файл или папку dst.

# shutil.rmtree(path) - Удаляет текущую директорию и все поддиректории; path должен указывать на
# директорию, а не на символическую ссылку. С ЭТИМ РАБОТАТЬ ОЧЕНЬ АККУРАТНО!



# Семинар!

# def f(x):
#     return x
# print(f(4))

# f1 = lambda x: x                       # lambda x == def f(x), получается х здесь - это аргумент, передаваемый в функцию, 
# print(f(2))                            # а после двоеточия x == return x - здесь это уже возвращаемое значение

# print((lambda x, y: x * y)(9, 4))      # Кратчайший способ написания и вызова функции

# num = '1 3 45 6 7 9'.split()
# print(num)
# num1 = list(map(int, num))                           # Перевод списка строк в список чисел
# print(num1)
# num1 = list(map(lambda x: x*3, num1))                # Работа функции map()
# print(num1)

# num1 = list(filter(lambda x: x % 2 == 0, num1))      # Работа функции filter()
# print(num1)



# Задача N1.


# У вас есть код, который вы не можете менять 
# (так часто бывает, когда код в глубине программы используется множество раз и вы не хотите ничего сломать):
# transformation = <???>
# values = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29] # или любой другой список
# transormed_values = list(map(transformation, values))
# Единственный способ вашего взаимодействия с этим кодом - посредством задания функции transformation.
# Однако вы поняли, что для вашей текущей задачи вам не нужно никак преобразовывать список значений, а нужно получить его как есть.
# Напишите такое лямбда-выражение transformation, чтобы transformed_values получился копией values.
# Пример ввода и вывода данных представлены на следующем слайде


# values = [1, 23, 42, 'asdfg']
# transformed_values = list(map(lambda x: x, values))
# print(transformed_values)
# if values == transformed_values:
#     print('ok') 
# else:
#     print('fail')


# ЗАДАЧА №2.


# Планеты вращаются вокруг звезд по эллиптическим орбитам. 
# Назовем самой далекой планетой ту, орбита которой имеет самую большую площадь. 
# Напишите функцию find_farthest_orbit(list_of_orbits), которая среди списка орбит планет найдет ту, 
# по которой вращается самая далекая планета. Круговые орбиты не учитывайте: вы знаете, что у вашей звезды таких планет нет.
# Результатом функции должен быть кортеж, содержащий длины полуосей эллипса орбиты самой далекой планеты. 
# Каждая орбита представляет из себя кортеж из пары чисел - полуосей ее эллипса. 
# Площадь эллипса вычисляется по формуле S = pi*a*b, где a и b - длины полуосей эллипса. 
# При решении задачи используйте списочные выражения. 
# Подсказка: проще всего будет найти эллипс в два шага: сначала вычислить самую большую площадь эллипса, 
# а затем найти и сам эллипс, имеющий такую площадь. Гарантируется, что самая далекая планета ровно одна
# Пример ввода и вывода данных представлены на следующем слайде

# Ввод:
# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)] print(*find_farthest_orbit(orbits))
# Вывод:
# 2.5 10

# 1-ый вариант решения!!!

orbits = [(5, 3), (2.5, 10), (7, 2), (6, 6), (4, 30)]
orbits = list(filter(lambda x: (x[0] != x[1]), orbits))
# print(orbits)
square = list(map(lambda x: x[0] * x[1], orbits))
result = max(square)
for i in range(len(orbits)):
    if orbits[i][0] * orbits[i][1] == result:
        print(orbits[i][0], orbits[i][1])

# 2-ой вариант решения!!!

print(*max([orbit for orbit in orbits if orbit[0] != orbit[1]], key=lambda x: x[0] * x[1]))

# 3-ий вариант решения!!!

print(*max(orbits, key=lambda x: x[0] * x[1]*(x[0] != x[1])))


# yes = False
# no = True
# x = 11
# print([yes, no][x>10])                         # Вывод объекта через BOOL данные