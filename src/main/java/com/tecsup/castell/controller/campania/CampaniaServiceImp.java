package com.tecsup.castell.controller.campania;

import com.tecsup.castell.dao.CampainDAO;
import com.tecsup.castell.helper.EstadoEnum;
import com.tecsup.castell.model.Campania;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampaniaServiceImp implements CampaniaService{

    @Autowired
    CampainDAO campainDAO;
    
    @Override
    public List<Campania> all() {
        return campainDAO.all();
    }

    @Override
    public Campania find(Long id) {
        return campainDAO.find(id);
    }

    @Override
    public void save(Campania campania) {

        if(campania.getId() == null){
            campania.setEstado(EstadoEnum.ACTIVO.toString());
            campainDAO.save(campania);
        }else{
        
        campainDAO.update(campania);
        }
    }

    @Override
    public void delete(Long id) {
        Campania camp = this.find(id);
        campainDAO.delete(camp);
        
    }
    
}
