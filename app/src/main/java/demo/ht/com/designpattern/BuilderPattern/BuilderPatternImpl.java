package demo.ht.com.designpattern.BuilderPattern;

public class BuilderPatternImpl implements BuilderPatternInterface {

    private final BuilderPatternBean bmBuilderPatternBean;
    private final CarColor mCarColor;
    private final CarWeight mCarWeight;
    private final CarName mCarName;

    public BuilderPatternImpl(){
        mCarColor = new CarColor();
        mCarWeight = new CarWeight();
        mCarName = new CarName();
        bmBuilderPatternBean = new BuilderPatternBean(mCarColor, mCarWeight, mCarName);
    }

    @Override
    public BuilderPatternImpl createColor(String color) {
        mCarColor.setColor(color);
        bmBuilderPatternBean.setmColor(mCarColor);
        return this;
    }

    @Override
    public BuilderPatternImpl createWeight(int weight) {
        mCarWeight.setWeight(weight);
        bmBuilderPatternBean.setmCarWeight(mCarWeight);
        return this;
    }

    @Override
    public BuilderPatternImpl createName(String name) {
        mCarName.setName(name);
        bmBuilderPatternBean.setmCarName(mCarName);
        return this;
    }

    @Override
    public BuilderPatternBean build() {
        return bmBuilderPatternBean;
    }
}
