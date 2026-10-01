
public class copy {

    public static void main(String[] args) {
        int marks[] = {11, 12, 13};
        Acc_Holder acc1 = new Acc_Holder(marks);
        Acc_Holder acc2 = new Acc_Holder(marks, "password123");
        System.out.println(acc1.marks[1]);
        System.out.println(acc2.marks[1]);
        acc1.marks[1] = 100;
        System.out.println(acc2.marks[1]);
        System.out.println(acc2.password);

    }
};


class Acc_Holder {

    String Acc_Holder;
    String password;
    int marks[];

    // shallow copy constructor
    Acc_Holder(int marks[]) {
        this.marks = marks;
    }

    Acc_Holder(int marks[], String password) {
        this.marks = new int[marks.length];
        this.password = password;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
}
