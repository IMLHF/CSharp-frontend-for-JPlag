namespace JplagTests {
    interface IInteger {
        void Add(int i);
    }

    interface IDouble {
        void Add(double d);
    }

    interface INumber : IInteger, IDouble { }
}
