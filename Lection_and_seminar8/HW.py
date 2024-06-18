# Дополнить справочник возможностью копирования данных из одного файла в другой.
# Пользователь вводит номер строки, которую необходимо перенести из одного файла в другой.


def work_with_phonebook():

    choice = show_menu()

    phone_book = read_txt('phon.txt')
 
    while (choice < 7 and choice > 0):

        if choice == 1:
            print(phone_book)

        elif choice == 2:
            last_name = input('lastname - ')
            print(find_by_lastname(phone_book, last_name))

        elif choice == 3:
            last_name = input('lastname - ')
            new_number = input('new  number - ')
            print(change_number(phone_book, last_name, new_number))
	    	
        elif choice == 4:
            lastname=input('lastname - ')
            print(delete_by_lastname(phone_book, lastname))

        elif choice == 5:
            number=input('number - ')
            print(find_by_number(phone_book, number))

        elif choice == 6:
            user_data = input('new data - ')
            add_user(phone_book, user_data)
            # print(phone_book)
            write_txt('recipient.txt', phone_book)

        choice=show_menu()

def find_by_lastname(phone_book, last_name):
    for i in range(len(phone_book)):
        if phone_book[i]['Фамилия'] == last_name:
            return phone_book[i]['Телефон'], phone_book[i]['Имя'], phone_book[i]['Описание']
        
def change_number(phone_book, last_name, new_number):
    for i in range(len(phone_book)):
        if phone_book[i]['Фамилия'] == last_name and phone_book[i]['Телефон'] != new_number:
            phone_book[i]['Телефон'] = new_number
            return phone_book[i]

def delete_by_lastname(phone_book, lastname):
    for i in range(len(phone_book)):
        if phone_book[i]['Фамилия'] == lastname:
            (phone_book.pop(i))
            return phone_book

def find_by_number(phone_book, number):
     for i in range(len(phone_book)):
        if phone_book[i]['Телефон'] == number:
            return phone_book[i]['Фамилия'], phone_book[i]['Имя'], phone_book[i]['Описание']
        
def add_user(phone_book, user_data):
    user_data = eval(user_data)                     # Преобразовал введенную строку в словарь!!!
    for i in range(len(phone_book)):
        if phone_book[i] != user_data:
            return phone_book.append(user_data)


def show_menu():
    print("\n Выберите необходимое действие:\n"
    "1. Отобразить весь справочник\n"
    "2. Найти абонента по фамилии\n"
    "3. Изменить номер абонента\n"
    "4. Удалить абонента из справочника по фамилии\n"
    "5. Найти абонента по номеру телефона\n"
    "6. Добавить абонента в справочник")
    choice = int(input())
    return choice

def read_txt(filename):

    phone_book=[]

    fields= ['Имя', 'Фамилия', 'Телефон', 'Описание']

    line = []

    with open(filename,'r',encoding='utf-8') as phb:

        for line in phb:

            record = dict(zip(fields, line.split(',')))           #dict((фамилия, Иванов),(имя, Точка),(номер,8928),(язык, C#))

            phone_book.append(record)

    return phone_book


def write_txt(filename , phone_book):

    with open(filename,'w',encoding='utf-8') as phout:

        for i in range(len(phone_book)):

            s = ''
            result = phone_book[i]

            for key, word in result.items():

                s = s + key + ' ' + word + ' '

            phout.write(f'{s[:-1]}\n')

work_with_phonebook()
