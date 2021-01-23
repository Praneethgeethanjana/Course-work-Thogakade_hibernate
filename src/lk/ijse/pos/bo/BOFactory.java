package lk.ijse.pos.bo;

import lk.ijse.pos.bo.custom.impl.CustomerBOimpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getInstance(){
        return (null==boFactory)?(boFactory=new BOFactory()) : (boFactory);

    }

    public enum BOType{
        CUSTOMER,ITEM
    }

    public <T> T getBo(BOType boType){
        switch (boType){
            case CUSTOMER:
                return (T) new CustomerBOimpl();
            default:
                return null;
        }
    }
}
