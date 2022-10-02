public class Scissors implements Strategy {

    private int value;
    Scissors() {value = 2;}

    @Override
    public int getValue() {return value;}
    @Override
    public void throwOut() {
        System.out.println("가위를 냅니다.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Strategy) {
            return this.getValue() == ((Strategy)obj).getValue();
        }
        return false;
    }
}
