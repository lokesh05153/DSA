class Student {
    String name;
    int id;

       Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}