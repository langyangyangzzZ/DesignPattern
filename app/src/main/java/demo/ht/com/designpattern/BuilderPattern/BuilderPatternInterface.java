package demo.ht.com.designpattern.BuilderPattern;

public interface BuilderPatternInterface {
    public BuilderPatternImpl createColor(String color);
    public BuilderPatternImpl createWeight(int weight);
    public BuilderPatternImpl createName(String name);
    public BuilderPatternBean build();
}
