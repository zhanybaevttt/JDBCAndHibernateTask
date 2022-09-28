package peaksoft;

public class Zadacha {
    /**Тапшырма

    Атайын даярдалган проект менен таанышып чыгыныз жана аны аягына чыгарыныз.

    Тапшырманы буткон сон, жазган методдорунузду атайын жазылган JUnit тесттери менен текшериниз.

    Аягында ал тесттердин баары отушу керек.

    Тесттерди иштетуу учун test деген папканы таап анын ичиндеги классты иштетуу керек.

    Run (Класстын аты) деген кнопканы басып

    Класс UserDaoHibernateImpl бул тапшырмада бош калат.

    User деген класстын свойствалары:

    Long id

    String name

    String lastName

    Byte age



    Класстарга коюлган талаптар:

            1. dao/service класстары оздоруно байланыштуу интерфейстерди реализация кылуусу керек

2. Класс dao-до пустой конструктор болуш керек (по умолчанию)

3. Баардык полялар private болуш керек

4. service dao-нун методдорун иштетет

5. База менен байланышы бар иштер dao-до болуш керек

6. Util классында базага кошулуу логикасы болуш керек



    Керектүү операциялар:

            1. User-ге таблица тузуу исключениеге алып келбеши керек, эгерде ошондой таблица уже базада болсо

2. Таблицаны очуруу исключениеге алып келбеши керек эгерде, ошондой таблица базада жок болсо

3. Таблицанын ичиндеги маалыматтарды очуруу

4. User кошуу таблицага

5. User-ди таблицадан очуруу (id менен)

6. Бардык user-лерди алуу



    Main класстын main методунда томондогудой операциялар болушу керек:

            1. User-лерге таблица тузуу

2. 4 user-ди базага кошуу. Ар бир user базага кошулгандан кийин анын аты  базага кошулду деп консольго чыгуусу керек

3. Бардык user-лерди алуу жана консольго чыгаруу, toString методун override кылышыныз керек

4. Таблицанын маалыматтарын очуруу

5. Таблицаны очуруу
            */
}
