package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain extends Child {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
        child.printParent();
    }
}
