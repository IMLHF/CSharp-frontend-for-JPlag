using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JplagTests {
    class MasterProgram {
        private int[] arr;

        enum MyEnum {
            one,
            two,
            three
        }

        public MasterProgram() {
            arr = new int[] {
                0,
                1,
                2,
                3
            };
        }

        public MasterProgram(int size) {
            arr = new int[size];
        }

        public Boolean isValid(String s) {
            bool b;
            b = false;
            return b;
        }

        void doSomething() {
            int i = 3;
            do {
                i--;
            } while (i > 0);

            int j = 4;
            while (j > 0) {
                j--;
            }

            List<int> numbers = new List<int>();
            for (int k = 0; k < 5; k++) {
                numbers.Add(k);
            }

            foreach (int n in numbers) {
                if (n % 3 == 0)
                    continue;
                Console.WriteLine(n);
            }
        }

        public String getEnding(int n) {
            String ending = "";
            switch (n) {
                case 1:
                    ending = "st";
                    break;
                case 2:
                    ending = "nd";
                    break;
                case 3:
                    ending = "rd";
                    break;
                default:
                    break;
            }
            return ending;
        }

        public String exceptionalMethod() {
            string s = "";
            try {
               s = "trying";
            } catch {
                throw new Exception();
            } finally {
                s = "done";
            }
            return s;
        }

        public bool iffyMethod(string s) {
            if (s != null)
                return true;
            else if (s.Length > 0)
                return true;
            else {
                bool b = (s.Length % 2 == 0) ? true : false;
                return b;
            }
        }

        public void oneMoreMethod() {
            using (StreamReader s = new StreamReader("somefile.txt")) {

            }
        }

        
    }
}
