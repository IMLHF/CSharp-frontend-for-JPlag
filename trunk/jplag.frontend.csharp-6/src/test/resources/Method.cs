using System;

namespace JplagTests {
    class Method {
        void print(string s) {
            System.Console.WriteLine(s);
        }

        public void wrapperMethod(String s) {
            print(s);
        }

        public virtual int getQuarters(double money) {
            return (int) (money / 0.25);
        }
    }
}
