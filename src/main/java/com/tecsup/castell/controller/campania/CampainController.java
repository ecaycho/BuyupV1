

package com.tecsup.castell.controller.campania;

import com.tecsup.castell.model.Campania;
import com.tecsup.castell.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("campania")
@RequestMapping("campania")
public class CampainController {
    
    @Autowired
    CampaniaService service;
    
     @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("campania", service.all());
        return "campania/index";
    }
    
      @RequestMapping("create")
    public String create(Model model) {

        model.addAttribute("campania", new Campania());
        return "campania/formulario";
    }

     @RequestMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {

        Campania campania = service.find(id);
        model.addAttribute("campania", campania);

        return "campania/formulario";
    }
    
     @RequestMapping("save")
    public String save(@ModelAttribute Campania campania, Model model) {

        service.save(campania);
        return "redirect:/campania";
    }
    
     @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.delete(id);
        return "redirect:/campania";
    }
    
}
