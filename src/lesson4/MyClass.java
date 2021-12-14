package lesson4;

//Создать класс для работы с  массивами чисел.
// Создать методы для сортировки,
// нахождения максимального элемента,
// поиска номера элемента в массиве по его значению (любое вхождение).
// Всю общую логику вынести в приватные методы.
public  class MyClass {



    int[] mas = {1, 2, 4, 5, 6, 7, 8, 9};

    private void findTheMaximumElement() {
        int maxNumber = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = maxNumber;
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
            }
        }

        System.out.println(" Максимальный элемент: " + maxNumber);
    }

    public static int findNumberInMass(int[] mas, int needFind) {

        for (int i = 0; i < mas.length; i++) {
            if (needFind == mas[i]) {
                return i + 1;
            }
        }
        return 0;
    }
}
