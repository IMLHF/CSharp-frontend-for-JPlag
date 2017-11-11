// https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/keywords/using-directive
// "To allow the use of types in a namespace so that you do not have to qualify the use of a type in that namespace: "
using System.IO;

// "To allow you to access static members of a type without having to qualify the access with the type name."
using static System.Console;
using static System.Math;

// "To create an alias for a namespace or a type. This is called a using alias directive. "
using intAlias = System.Int32; // java does not support import aliasing, so should we match this or not?

namespace JplagTests {
    class UsingDirective {
        intAlias i;

        System.IO.StreamReader r;
        StreamWriter w;

        public static void doTheMath() {
            WriteLine(Sqrt(3 * 3 + 4 * 4));
        }
    }
}
