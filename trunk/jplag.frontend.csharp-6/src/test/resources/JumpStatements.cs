using System;

namespace JplagTests {
    class JumpStatements {
        public static int sumPositive(int?[] array) {
            int sum = 0;
            for (int i = 0; i < array.Length; i++) {
                if (array[i] == null) // what's the value of null?
                    throw new NullReferenceException();
                if (array[i] == -1) // -1 means end early
                    break;
                if (array[i] < 0) // ignore all negative numbers
                    continue;
                sum += (int) array[i];
            }
            Console.WriteLine(sum);
            return sum;
        }
    }
}
