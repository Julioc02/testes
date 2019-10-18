package com.teste.teste.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.teste.teste.model.Aluno;
import com.teste.teste.repository.AlunoRepository;

@Controller
public class HomeControler {
	@Autowired
	AlunoRepository alunos;
	
    @GetMapping("/teste")
    public ModelAndView home() {
    	ModelAndView modelAndView = new ModelAndView("index");
    	modelAndView.addObject("Aluno", alunos.findAll());
    	modelAndView.addObject(new Aluno());
    	return modelAndView;
    }
    
    @PostMapping("/salvar")
    public String salvar(Aluno aluno) {
    	alunos.save(aluno);
     	return "redirect:/";
    }
}
