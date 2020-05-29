package demo.ht.com.designpattern.BuilderPattern;

public class BuilderPatternManger  {

    private BuilderPatternManger(){

    }

    private static BuilderPatternManger mBuilderPatternManger;
    public static BuilderPatternManger getInstance(){
        if (mBuilderPatternManger == null) {
            synchronized (BuilderPatternManger.class){
                mBuilderPatternManger = new BuilderPatternManger();
                return mBuilderPatternManger;
            }
        }
        return mBuilderPatternManger;
    }

    public BuilderPatternBean createCar(BuilderPatternImpl mBuilderPatternImpl){
        mBuilderPatternImpl.createName("兰博基尼").
                createWeight(200).
                createColor("红色");
        BuilderPatternBean build = mBuilderPatternImpl.build();
        return build;
    }
}
