package spring.play.lib;

import java.util.function.Function;

public class LibraryBeanImpl implements LibraryBean {

    private Function<String, String> func;

    public LibraryBeanImpl() {
        func = a -> a.toUpperCase();
    }

    public LibraryBeanImpl(Function<String, String> func) {
        this.func = func;
    }

    @Override
    public String aMethod(String input) {
        return func.apply(input);
    }

}
