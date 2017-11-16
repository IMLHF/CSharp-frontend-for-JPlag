using System;

namespace JplagTests {
    class Loops {
        public static void doSomething() {
            int[] array = { 0, 1, 2, 3 };

            int index = 0;
            do {
                Console.Write(array[index++]+", ");
            } while (index < array.Length);
            Console.WriteLine();

            index = 0;
            while (index < array.Length) {
                Console.Write(array[index++] + ", ");
            }
            Console.WriteLine();

            for (int i = 0; i < array.Length; i++) {
                Console.Write(array[i]+", ");
            };
            Console.WriteLine();

            foreach (int number in array) {
                Console.Write(number+", ");
            }
            Console.WriteLine();

        }
    }
}
