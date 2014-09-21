package com.tecsup.castell.controller.campania;

import com.tecsup.castell.model.Campania;
import java.util.List;

public interface CampaniaService {

     List<Campania> all();
    
    Campania find(Long id);
    
    void save(Campania categoria);
    
    void delete(Long id);
}
