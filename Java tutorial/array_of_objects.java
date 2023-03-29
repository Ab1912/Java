class student {
    int roll_no;
    String name;
    student(int roll_no,String name) {
        this.roll_no = roll_no;
        this.name = name;        
    }
    void print() {
        System.out.println("Roll no : "+roll_no);
        System.out.println("Student name : "+name);
        System.out.println("--------------------");
    }
}


class array_of_objects {
    public static void main(String[] args) {
        student[] obj = new student[5];
        obj[0] = new student(1,"Ravi");
        obj[1] = new student(2,"Sankar");
        obj[2] = new student(3,"Karthik");
        obj[3] = new student(4,"Suresh");
        obj[4] = new student(5,"Kumar");
        for (int i = 0; i < obj.length; i++) {
            obj[i].print();
        }
    }
}