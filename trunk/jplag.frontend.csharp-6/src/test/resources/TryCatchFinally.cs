using System;
using System.IO;

namespace JplagTests {
    class TryCatchFinally {
        public void doSomething() {
            try {
                // do something that might blow up
            }
            catch (NullReferenceException) {
                throw;
            }
            catch (Exception e) when (e is OutOfMemoryException || e is StackOverflowException) {
                Console.WriteLine(e.Message);
            }
            finally {
                // reset for next run
            }

            using (TextWriter w = File.CreateText("log.txt"), o = File.CreateText("other.txt")) {

            }
            try {
                // something else
            }
            // ignore exceptions
            finally {
                // reset for next run
            }
        }
    }
}
