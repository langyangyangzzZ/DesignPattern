package demo.ht.com.designpattern.BuilderPattern;

public class BuilderPatternBean {
    public CarColor mColor;
    public CarWeight mCarWeight;
    public CarName mCarName;

    public CarColor getmColor() {
        return mColor;
    }

    public void setmColor(CarColor mColor) {
        this.mColor = mColor;
    }

    public CarWeight getmCarWeight() {
        return mCarWeight;
    }

    public void setmCarWeight(CarWeight mCarWeight) {
        this.mCarWeight = mCarWeight;
    }

    public CarName getmCarName() {
        return mCarName;
    }

    public void setmCarName(CarName mCarName) {
        this.mCarName = mCarName;
    }

    public BuilderPatternBean(CarColor mColor, CarWeight mCarWeight, CarName mCarName) {
        this.mColor = mColor;
        this.mCarWeight = mCarWeight;
        this.mCarName = mCarName;
    }
}
