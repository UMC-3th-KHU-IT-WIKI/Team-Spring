public class Paper extends Object implements Strategy{

    private int value;
    Paper() { value = 1; }

    @Override
    public int getValue() {
        return value;
    }


    @Override
    public void throwOut() {
        System.out.println("보를 냅니다.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Strategy) {
            return this.getValue() == ((Strategy)obj).getValue();
        }
        return false;
    }
}
