class SuperSenior {
    void printName() {
        System.out.println("SuperSenior");
    }
}

class Senior extends SuperSenior {
    void printName() {
        System.out.println("Senior");
    }
}

class Junior extends Senior {
    void printName() {
        System.out.println("Junior");
    }
}

class Alumni extends SuperSenior {
    void printName() {
        System.out.println("Alumni");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        SuperSenior manush = new SuperSenior();
        manush.printName();
        Senior khushali = new Senior();
        khushali.printName();
        SuperSenior hasti = new Senior();
        hasti.printName();
        SuperSenior mann = new Junior();
        mann.printName();
        SuperSenior rahil = new Alumni();
        rahil.printName();
    }
}
