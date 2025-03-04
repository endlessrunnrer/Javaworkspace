import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {
    private static Singleton singleton =  new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}


