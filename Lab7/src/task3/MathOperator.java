package task3;

public enum MathOperator {
    ADD {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int execute(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int execute(int a, int b) {
            return a / b;
        }
    };

    public abstract int execute(int a, int b);
}
