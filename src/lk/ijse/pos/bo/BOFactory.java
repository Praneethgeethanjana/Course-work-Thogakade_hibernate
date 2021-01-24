package lk.ijse.pos.bo;

import lk.ijse.pos.bo.custom.impl.CustomerBOimpl;
import lk.ijse.pos.bo.custom.impl.ItemBOimpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getInstance(){
        return (null==boFactory)?(boFactory=new BOFactory()) : (boFactory);

    }

    public enum BOType{
        CUSTOMER,ITEM
    }

    public <T extends SuperBO> T getBo(BOType boType){
        switch (boType){
            case CUSTOMER:
                return (T) new CustomerBOimpl();
            case ITEM:
                return (T) new ItemBOimpl();
            default:
                return null;
        }
    }
}
