package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.ItemBO;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.impl.ItemDAOimpl;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;

import java.util.ArrayList;

public class ItemBOimpl implements ItemBO {

    ItemDAOimpl itemDAO= DAOFactory.getInstance().getDao(DAOFactory.DAOType.ITEM);

    @Override
    public boolean saveItem(ItemDTO itemDTO) throws Exception {
        return itemDAO.save(new Item(itemDTO.getItemCode(),itemDTO.getDescription(),itemDTO.getQty(),itemDTO.getPrice()));

    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        return itemDAO.delete(id);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return itemDAO.update(new Item(itemDTO.getItemCode(),itemDTO.getDescription(),itemDTO.getQty(),itemDTO.getPrice()));

    }

    @Override
    public ItemDTO getItem(String id) throws Exception {
       Item item=itemDAO.get(id);
       return new ItemDTO(item.getItemCode(),item.getDescription(),item.getQty(),item.getPrice());

    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        return null;
    }
}
