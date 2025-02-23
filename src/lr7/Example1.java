package lr7;

// Класс с методом main для демонстрации работы
public class Example1 {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Привет");
        SubClass obj2 = new SubClass("Привет", "Мир");
        SubClass obj3 = new SubClass("Привет");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

// Суперкласс с приватным текстовым полем
class SuperClass {
    private String text;

    // Конструктор с текстовым параметром
    public SuperClass(String text) {
        this.text = text;
    }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "SuperClass { text = '" + text + "' }";
    }
}

// Подкласс, наследующий SuperClass и добавляющий ещё одно приватное текстовое поле
class SubClass extends SuperClass {
    private String extraText;

    // Конструктор с одним текстовым параметром
    public SubClass(String text) {
        super(text);
        this.extraText = ""; // или можно задать значение по умолчанию
    }

    // Конструктор с двумя текстовыми параметрами
    public SubClass(String text, String extraText) {
        super(text);
        this.extraText = extraText;
    }

    // Переопределённый метод toString(), который включает данные из суперкласса и своё поле
    @Override
    public String toString() {
        return "SubClass { " + super.toString() + ", extraText = '" + extraText + "' }";
    }
}