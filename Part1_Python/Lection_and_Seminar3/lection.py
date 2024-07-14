# Задача #1.
# Дан список чисел. Определите, сколько в нем встречается различных чисел.
# Input: [1, 1, 2, 0, -1, 3, 4, 4] Output: 6

# length = int(input("Введите длину списка: "))
# lists = []
# for i in range(length):
#     lists.append(int(input("Введите элемент массива ")))
#     numbers = set(lists)
# print(len(numbers))


# Задача #2.
# Дана последовательность из N целых чисел и число K. Необходимо сдвинуть всю последовательность
# (сдвиг - циклический) на K элементов вправо, K – положительное число.
# Input: [1, 2, 3, 4, 5] k = 3 Output: [4, 5, 1, 2, 3]

lists = [1, 2, 4, 5, 6, 8]
n = len(lists)
k = int(input("Введите число, на которое необходимо сдвинуть список: "))
ostatok = k % n
print(ostatok)

for i in range(ostatok):
    value = lists.pop(0)
    lists.append(value)                # Также можно сделать через insert(),смотря с какой стороны отсчитывать список
print(lists)