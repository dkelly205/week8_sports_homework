package models;

public enum Result {
        WIN(3),
        LOSS(0),
        DRAW(1);

        private final int value;


        Result(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
}

