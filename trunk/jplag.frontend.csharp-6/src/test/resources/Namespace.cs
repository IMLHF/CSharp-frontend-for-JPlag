using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SampleNamespace {
    class SampleClass {
        public void sampleMethod() {
            System.Console.WriteLine("sampleMethod inside SampleNamespace");
        }
    }

    // Create a nested namespace, and define another class.
    namespace NestedNamespace {
        class SampleClass {
            public void sampleMethod() {
                System.Console.WriteLine("sampleMethod inside NestedNamespace");
            }
        }
    }
}

// defined another class inside of a nested namespace defined elsewhere
namespace SampleNamespace.NestedNamespace {
    class AnotherClass {
        public void anotherMethod() {
            System.Console.WriteLine("anotherMethod inside SampleNamespace.NestedNamespace");
        }
    }
}