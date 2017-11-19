public class SimpleClass {
    public SimpleClass() {

    }

    private class InnerClass {

    }

    public class InteriorClass {

    }
}

public class InhertingClass : SimpleClass {
    private class Foo {
        private class Bar {
            public Bar() {

            }
        }
    }
}