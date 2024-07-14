# string = '8 9 a k 9 b'
# print(string)
# # string = string.split()                   # По умолчанию разделяет текст по любому количеству пробелов
# # print(string)
# string = string.replace(' ', '').split()    # Реплейс заменяет " "(пробел), на ""(пустой элемент), в данном случае
# print(string)




# Задача N1.
# Напишите программу, которая принимает на вход строку, и отслеживает, сколько раз каждый символ уже встречался.
# Количество повторов добавляется к символам с помощью постфикса формата _n.
# Input: a a a b c a a d c d d
# Output: a a_1 a_2 b c a_3 a_4 d c_1 d_1 d_2
# Для решения данной задачи используйте функцию .split()

# chars = input()
# chars = chars.split()
# dict = {}
# result_list = ""
# for i in chars:
#     count = dict.get(i)                                 # Метод для получения первичного значения ключа. None в начальном случае
#     # print(count)
#     if i not in result_list:
#         result_list = result_list + i + " "
#         dict[i] = 1                                     # Значение ключа
#     else:
#         result_list = result_list + i + "_" + str(dict[i]) + " "
#         dict[i] = count + 1

# print(result_list)

    


# Задача No27. Решение в группах
# Пользователь вводит текст(строка). Словом считается последовательность непробельных символов идущих подряд,
# слова разделены одним или большим числом пробелов. Определите, сколько различных слов содержится в этом тексте.
# Input: She sells sea shells on the sea shore The shells that she sells are sea shells
# I'm sure. So if she sells sea shells on the sea shore I'm sure that the shells are sea shore shells
# Output: 13

text = "She sells sea shells on the sea shore The shells that she sells are sea shells I'm sure.So if she sells sea shells on the sea shore I'm sure that the shells are sea shore shells"
result_text = list()
text = text.replace('.', ' ')
text = text.upper().split()
print(len(set(text)))                 # Делаем из СПИСКА -> МНОЖЕСТВО, а множества содержат только уникальные значения