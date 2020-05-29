package demo.ht.com.designpattern.factoryMethod;

public class FactoryMethodMessage  {

    private FactoryMethodMessage(){}

    private static FactoryMethodMessage mFactoryMethodMessage = null;

    public static FactoryMethodMessage getInstance(){
        if (mFactoryMethodMessage == null) {
            synchronized (FactoryMethodMessage.class){
                if (mFactoryMethodMessage == null) {
                    mFactoryMethodMessage = new  FactoryMethodMessage();
                }
            }
        }
        return mFactoryMethodMessage;
    }

    public String getFactryMethod(String type){
        if (type.equals("a")) {
            return new FactoryMethodA().Send();
        }else if(type.equals("b")){
            return new FactoryMethodB().Send();
        }else if (type.equals("c")){
            return new FactoryMethodC().Send();

        }
         return "没有此类型";

    }
}
