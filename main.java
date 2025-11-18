class Student {
    // Instance variables
    String name;
    int rollNo;

    // Constructor using 'this' keyword
    Student(String name, int rollNo) {
        // 'this' refers to the current object’s instance variables
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student information
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNo);
    }
}

    public static void main(String[] args) {
        // Creating an object of Student class
        Student st = new Student("John", 101);
        st.display();  // Display details of student1
    }

