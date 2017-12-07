package pl.waw.sgh.shapes;

public abstract class Shape {

    double parA;
    double parB;

    public Shape(Params params) {
        setParams(params);
        /*this.parA = params.getParA();
        this.parB = params.getParB();*/
    }

    public void setParams(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public void setParams(double parA) {
        this.parA = parA;
    }

    public void setParams(Params params) {
        this.parA = params.getParA();
        this.parB = params.getParB();
    }

    public void setParams(ParamsSimple paramsSimple) {
        this.parA = paramsSimple.parA;
        this.parB = paramsSimple.parB;
    }

    public abstract double calcSurface();

    @Override
    public String toString() {
        return "Shape{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (Double.compare(shape.parA, parA) != 0) return false;
        return Double.compare(shape.parB, parB) == 0;
    }

    /*//@Override
    public boolean isEqual(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (Double.compare(shape.parA, parA) != 0) return false;
        return Double.compare(shape.parB, parB) == 0;
    }*/
}
