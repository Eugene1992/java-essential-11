package com.cbs.edu.hw_04;

import com.cbs.edu.hw_02.*;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class Controller {
    private IEmployeeDAO iEmployeeDAO ;

    public Controller(IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    private void hadleRequest(String req){
        while(!req.equals("Exit")){
            switch (req){
                case "1" :
                    iEmployeeDAO.add(new Employee("jhk", 20, 7800));
            }
        }
    }

    public void startListener(){
    }


}
