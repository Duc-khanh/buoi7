package StaticMethod;

public class method {


        private int rollno;
        private String name;
        private static String
                school= "";

        method(int r, String n) {
            rollno = r;
            name = n;
        }
        static void change() {

            school = "CODEGYM";
        }

        void display() {
            System.out.println(rollno + " " + name + " " +
                    school);
        }

}
