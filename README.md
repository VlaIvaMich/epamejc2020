# epamejc2020
### HW0 - TrafficLight

### HW1 - Own immutable class
> Создать immutable class, создать пару объектов, посмотреть как работает, поэксперементировать с данными.

### HM2 - Arrays 
> 2.1. Создать массив массивов, задается размерность на основании которое генерируются случайные символы типа char. Пример:

    Input: 4 2
    output:
    k c 
    b p 
    b h 
    h g 

> 2.2. Сгенерировать массив массивов указав размерность, заполнить его случайными символами. Написать 2 стратегии, которые будут формировать строку на основе данного массива. Стратегия А - работает по принципу *_*_*, а стратегия B - работает по принципу _*_*_ . Пример:

    input: 5 5
    output: 
    d a l p j 
    v c b z g 
    a d l r f 
    f d m x h 
    k d l h b 
    input strategy: A
    output: dljalfklb
> 2.3. Написать программу которая будет генерировать пирамидку. Пример:

    input: 4
    output: 
    XXXX
    XXX
    XX
    X

### HM3 - Strings
> 3.1. Написать программу которая генерирует новую строку на основании входных данных, строка + четные/нечетные, пример:

    Input: String        Input: even        output: tig
> 3.2. Написать программу которая будет генерировать строку по индексам. Пример:

    Input: Hello World,     
    input: 0  output: H, 
    input: 4  output: Ho, 
    input: 6 output: HoW
> 3.3. Поменять местами символы в строке, на вход приходит строка и 2 индекса между, которыми нужно сделать обмен. Пример:

    Input: Hello World
    Input: 0, 4
    output oelloH World
> 3.4. Написать программу которая переворачивает слова, но при этом оставляет их на прежних местах. Пример

    Input: Hello World
    output: olleH dlroW

### HM4 - Recursion
> 4.1. Поиск числа Фиббоначи

> 4.2. Написать программу которая умеет вовзодить в степени:

    input number: 4
    input pow: 3
    output: 64
> 4.3.  Посчитать количество чисел:

    input: 567
    output: 3

### HM5 - Tests
> Покрыть код junit 4.12 тестами

### HM6 - Annotation
> Создать свою кастомную аннотацию где будет "имя - string" и "возраст - int", то есть в аннотации передаем (name = "sdgf", age = "12"). 
> Повесить аннотацию на конструктор. 
> Цель - сделать так чтобы когда у нас будет создаваться объект по типу Person person = new Person() - конструктор пустой, 
> через рефлексию мы должны достать данные из аннотации и подсунуть при инициализации объекта name и age из аннотации. Используйте ломбок.