using System;

namespace JplagTests {
    class Arrays {
        public int[] intArray;
        public int[,] intIntArray;
        public Object[] objectArray;
        public String[] stringArray;

        public int[] intArray2 = new int[] { 1, 2 };
        public int[,] intIntArray2 = new int[,] { { 1, 2 }, { 3, 4 } };
        public int[,] intIntArray3 = new int[2,3] { { 1, 2, 3 }, { 4, 5, 6 } };
        public Object[] objectArray2 = new Object[] { "1", "2" };
        public String[] stringArray2 = new String[] { "a", "b" };

        public int[] intArray3 = { 1, 2 };
        public Object[] objectArray3 = { "ffo", "bas" };
        public String[] stringArray3 = { "a", "b" };

        public void arrayManipulation() {
            int[] array;
            array = new int[10];
            array = new int[] { 9, 8, 7 };

            int[] array2 = { 0, 1, 2 };
        }

        public void makeJagged() {
            double[][] x = new double[5][];

            x[0] = new double[10];
            x[1] = new double[5];
            x[2] = new double[3];
            x[3] = new double[100];
            x[4] = new double[1];
        }
    }
}
