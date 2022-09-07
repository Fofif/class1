public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant();

        Student odin = new Student();
        odin.firstName = "Mark";
        odin.lastName = "Smit";
        odin.group = "A-123";
        odin.averageMark = 5.0;

        Aspirant aspirant = new Aspirant();
        aspirant.firstName = "Anny";
        aspirant.lastName = "Coyl";
        aspirant.group = "Abc-123";
        aspirant.averageMark = 4.5;

        Student[]all = {odin, aspirant};

        for (int i = 0; i < all.length ;i++){
            all[i].getScholarship();
        }
    }
}
