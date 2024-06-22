# В ячейке ниже представлен код генерирующий DataFrame, которая состоит всего из 1 столбца.
# Ваша задача перевести его в one hot вид. Сможете ли вы это сделать без get_dummies?

import random
import pandas as pd

lst = ["robot"] * 10
lst += ["human"] * 10
random.shuffle(lst)
data = pd.DataFrame({"whoAmI": lst})
# print(type(data.head()))

# for col_name, info in data.items():
    # print("col_name:", col_name, "info:\n", info)                  # Попытка решить через индексацию датафрейма

one_hot_data = pd.DataFrame()                                        # Создание one hot представления без использования get_dummies

for category in data['whoAmI'].unique():                             # Создаем столбцы для каждого уникального значения в 'whoAmI'
    one_hot_data[category] = (data['whoAmI'] == category).astype(int)# Это строка даёт нам значение 1 или 0 присравнении столбца и строки

one_hot_data = pd.concat([data, one_hot_data], axis=1)               # Объединяем первоначальный DataFrame с one hot
print(one_hot_data)
    
