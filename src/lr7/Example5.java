package lr7;

public class Example5 {
    public static void main(String[] args) {
        // Создаем объект суперкласса
        Task5Super superObj = new Task5Super("Super Text");

        // Создаем объект первого подкласса (с целочисленным полем)
        Task5SubInt subIntObj = new Task5SubInt("SubInt Text", 42);

        // Создаем объект второго подкласса (с символьным полем)
        Task5SubChar subCharObj = new Task5SubChar("SubChar Text", 'Z');

        // Прямой вызов метода displayInfo() для каждого объекта
        System.out.println("Прямой вызов метода displayInfo():");
        superObj.displayInfo();
        subIntObj.displayInfo();
        subCharObj.displayInfo();

        // Демонстрация полиморфизма:
        // Переменная суперкласса, ссылающаяся на объект производного класса.
        Task5Super ref;

        System.out.println("\nВызов метода через переменную суперкласса:");
        ref = subIntObj;
        ref.displayInfo();  // вызов переопределенного метода из Task5SubInt

        ref = subCharObj;
        ref.displayInfo();  // вызов переопределенного метода из Task5SubChar
    }
}

// Суперкласс с приватным текстовым полем
class Task5Super {
    private String text;

    // Конструктор с текстовым параметром
    public Task5Super(String text) {
        this.text = text;
    }

    // Метод для получения значения текстового поля (используется в подклассах)
    protected String getText() {
        return text;
    }

    // Метод, отображающий название класса и значение текстового поля
    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + " { text = " + text + " }");
    }
}

// Подкласс с защищённым целочисленным полем
class Task5SubInt extends Task5Super {
    protected int number;

    // Конструктор с двумя параметрами: текст и число
    public Task5SubInt(String text, int number) {
        super(text);
        this.number = number;
    }

    // Переопределенный метод для отображения значений полей и названия класса
    @Override
    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + " { text = " + getText() + ", number = " + number + " }");
    }
}

// Подкласс с защищённым символьным полем
class Task5SubChar extends Task5Super {
    protected char ch;

    // Конструктор с двумя параметрами: текст и символ
    public Task5SubChar(String text, char ch) {
        super(text);
        this.ch = ch;
    }

    // Переопределенный метод для отображения значений полей и названия класса
    @Override
    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + " { text = " + getText() + ", ch = " + ch + " }");
    }
}