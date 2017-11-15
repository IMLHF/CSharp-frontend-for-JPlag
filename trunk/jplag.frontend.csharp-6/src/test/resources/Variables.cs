using System;

namespace JplagTests {
    class Variables {
        int a;
        int b = 2;
        
        public void doSomething(int c, ref int d, out int e) {
            e = 5;
            int f, g = 7, h;

            a = g - e;
            c = (--a == 1) ? b + a : e - b;

            f = c;
            f *= b;
            f = h = g;
            h--;
            g++;
        }

        public void otherTypes() {
            String s1;
            string s2 = " not empty anymore ";
            s1 = s2;

            Boolean b = new bool();
        }
    }
}
