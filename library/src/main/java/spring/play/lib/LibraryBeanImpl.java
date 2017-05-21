package spring.play.lib;

public class LibraryBeanImpl implements LibraryBean {

    @Override
    public String aMethod(String input) {
        return input.toUpperCase();
    }

}
