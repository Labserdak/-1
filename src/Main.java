public class Main {
    public static void main(String[] arg) {
        Student a = new Student("Кирилл", "Клюшкин", "АПР456", 5);
        Aspirant b = new Aspirant("Анна", "Гречкина", "РОЛ123", 3.5, "Диван");
        Student c = new Aspirant("Константин", "Черепов", "БОГ666", 5, "Могилы");
        Student[] students = { a, b, c };
        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
