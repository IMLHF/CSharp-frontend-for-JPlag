namespace JplagTests {
    class IfElse {
        public static bool doSomething(bool a, bool b, bool c, bool d) {
            if (a) {
                // a is true
                if (b) {
                    // a and b are true
                } else if (c) {
                    // a and c are true but not b
                } else if (d) {
                    // a and d are true but not b or c
                }
            }
            else {
                // a is not true
                if (b) {
                    // a is not true and b is true
                }
                if (c) {
                    // a is not true and c is true
                }
            }
            return ((a && (b || c || d)) || b || c);
        }
    }
}
