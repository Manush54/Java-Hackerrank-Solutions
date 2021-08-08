class Doctor {
    String Doctor_name;
    int Doctor_age;

    public Doctor(String name, int age) {
        Doctor_name = name;
        Doctor_age = age;
    }

    void doctor_details() {
        System.out.printf("Doctor_Details:\n%-10s %-3d\n", Doctor_name, Doctor_age);
    }
}

class Surgeon extends Doctor {
    String Surgeon_name;
    int Surgeon_age;
    String Surgeon_Position;

    public Surgeon(String name, int age, String position) {
        super(name, age);
        Surgeon_name = name;
        Surgeon_age = age;
        Surgeon_Position = position;
    }

    void surgeon_details() {
        System.out.printf("Surgeon_Details:\n%-10s %-3d %-10s\n", Surgeon_name, Surgeon_age, Surgeon_Position);
    }
}

class MICU_Surgeon extends Surgeon {
    String Micu_surgeon_name;
    int Micu_surgeon_age;
    String Micu_surgeon_Position;
    int Micu_surgeon_Experience;

    public MICU_Surgeon(String name, int age, String position, int Experience) {
        super(name, age, position);
        Micu_surgeon_name = name;
        Micu_surgeon_age = age;
        Micu_surgeon_Position = position;
        Micu_surgeon_Experience = Experience;
    }
    void micu_surgeon_details() {
        System.out.printf("MICU_Surgeon_Details:\n%-10s %-3d %-10s %-3d\n", Micu_surgeon_name, Micu_surgeon_age, Micu_surgeon_Position, Micu_surgeon_Experience);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Doctor Mann = new Doctor("Mann", 20);
        Surgeon Hasti = new Surgeon("Hasti", 19, "Surgeon");
        Surgeon Khushali = new Surgeon("Khushali", 19, "Ass.Surgeon");
        MICU_Surgeon Manush = new MICU_Surgeon("Manush", 20, "MICU_Surgeon", 10);
        Mann.doctor_details();
        Hasti.doctor_details();
        Hasti.surgeon_details();
        Khushali.doctor_details();
        Khushali.surgeon_details();
        Manush.doctor_details();
        Manush.surgeon_details();
        Manush.micu_surgeon_details();
        Mann.Doctor_name = "Mann Shah";
        Mann.doctor_details();
        Manush.Doctor_name = "Manush Shah";
        Manush.micu_surgeon_details();          // Flaw in the code...
        Manush.doctor_details();
    }
}
