/*
 * Singleton:   применён - класс Controller, потому что он содержит общую логику обработки
 * ввода/вывода и генерации данных
 * Factory:     применён - класс Generator является абстрактной фабрикой, инкапсулируется
 * сложная логика создания объектов и избегается дублирование кода при создании объекта
 * Builder:     применён - класс Person имеет конструктор с большим количеством параметров,
 * есть риск ошибиться в их последовательности, билдер позволяет устанавливать значения
 * полям пошагово и только нужные
 * Adapter:     не применён - отсутствуют несовместимые методы
 * Bridge:      не применён - есть изначально: для классов *Hair, нет необходимости создавать
 * отдельно классы людей с определенными Hair (по типу PersonNoHair)
 * Facade:      не применён - есть изначально: в классе Main только вызов контроллера сложная
 * логика скрыта внутри системы
 * DTO:         применён -  класс FIO: для облегчения передачи данных фио между частями приложения,
 * данные фио теперь передаются вместе в определенном порядке
 * Шаблон:      применён - абстрактный класс Generator содержит алгоритм, который наследники
 * реализуют, не нарушая
 */