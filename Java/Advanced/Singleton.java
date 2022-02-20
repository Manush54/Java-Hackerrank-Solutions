import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton {
    // ******** Solution Start **********
    public String str;
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    // ********* Solution End ***********
}