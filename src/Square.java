public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {

        super(side, side);
    }

    public Square(double side, String color, boolean filled) {

        super(side, side, color, filled);
    }

    public double getSide() {

        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Một hình vuông có cạnh = "
                + getSide()
                + ", là lớp con của "
                + super.toString();
    }
}
