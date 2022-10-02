public class Rock implements Strategy {

    private int value;
    Rock() { value = 0;}


    @Override
    public void throwOut() {
        System.out.println("주먹을 냅니다.");
    }

    @Override
    public int getValue(){ return value; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Strategy) {
            return this.getValue() == ((Strategy) obj).getValue();
        }
        return false;
    }
}
