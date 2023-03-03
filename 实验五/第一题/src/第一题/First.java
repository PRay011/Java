package 第一题;

public class First {
    public static void main(String[] args) {
        Person person1 = new Person("王小美", "18397309720");
        Person student1 = new Student("张小胖", "18796459451", 1);
        Person empolyee1 = new Employee("彭小可", "13762606679", 12000, 2022, 2, 3);

        m1(person1);
        m2(person1);
        m3(person1);
        System.out.println();
        m1(student1);
        m2(student1);
        m3(student1);
        System.out.println();
        m1(empolyee1);
        m2(empolyee1);
        m3(empolyee1);

    }

    public static void m1(Person p) {

        String Name = p.getName();
        System.out.println(Name);
    }

    public static void m2(Person p) {
        System.out.println(p.toString());
    }

    public static void m3(Person p) {
        if (p instanceof Student) {
            ((Student) p).displayObject();
        } else if (p instanceof Employee) {
            ((Employee) p).displayObject();
        }
    }

}

class Person {
    protected String name;
    protected String number;

    Person() {

    }

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Person类：" + "姓名为" + name + "  " + "电话为" + number;
    }
}

class Student extends Person {
    private String grade;
    final static int a = 1;
    final static int b = 2;
    final static int c = 3;
    final static int d = 4;

    public Student(String name, String number, int grade) {
        super(name, number);
        switch (grade) {
            case a -> this.grade = "大一";
            case b -> this.grade = "大二";
            case c -> this.grade = "大三";
            case d -> this.grade = "大四";
        }

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        switch (grade) {
            case a -> this.grade = "大一";
            case b -> this.grade = "大二";
            case c -> this.grade = "大三";
            case d -> this.grade = "大四";
            default -> this.grade = "不知道是几年级";
        }
    }

    @Override
    public String toString() {
        return "Student类：" + "姓名为" + name + "  " + "电话为" + number + "  " + "年级为" + grade;
    }

    public void displayObject() {
        System.out.println("to" + name + "：请按时交实验报告");
    }

}

class Employee extends Person {
    private int salary;
    private MyDate date;

    Employee() {

    }

    public Employee(String name, String number, int salary, int year, int month, int day) {

        super(name, number);
        this.salary = salary;
        date = new MyDate(year, month, day);
    }

    @Override
    public String toString() {

        return "Empolyee：" + "姓名：" + name + "  " + "电话为：" + number + "  " + "工资为：" + salary + "  " +
                "应聘时间是：" + date.getYear() + "年" + date.getMonth() + "月" + date.getDay() + "日";
    }

    public void displayObject() {
        System.out.println("to" + name + "：请按时上班");
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}