package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.SuperBO;
import lk.ijse.pos.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean saveItem(ItemDTO itemDTO)throws Exception;

    public boolean deleteItem(String id)throws Exception;

    public boolean updateItem(ItemDTO itemDTO)throws Exception;

    public ItemDTO getItem (String id) throws Exception;

    public ArrayList<ItemDTO> getAllItems()throws Exception;



}
