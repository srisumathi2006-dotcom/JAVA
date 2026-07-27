package day13;
    class student {
        int id;
        String name;

        student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void show() {
            System.out.println(id + " " + name);
        }
    }

    class mentor extends student {

        mentor(int id, String name) {
            super(id, name);
        }
        void show() {
            System.out.println(id + " " + name);
        }
    }


    class hod extends mentor {

        hod(int id, String name) {
            super(id, name);
        }
    }
public class practice {
    public static void main(String[] args){
        student st=new student(01,"hari");
        mentor men=new mentor(02,"santh");
        hod h=new hod (10,"vishwa");

        st.show();
        men.show();
        h.show();

    }
}
