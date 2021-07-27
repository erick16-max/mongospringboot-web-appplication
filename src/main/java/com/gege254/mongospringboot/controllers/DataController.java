package com.gege254.mongospringboot.controllers;


import java.util.List;

import com.gege254.mongospringboot.domain.Data;
import com.gege254.mongospringboot.repositories.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/data")
    public ResponseEntity<?> getAllData (){
        List<Data> datas =    dataRepository.findAll();
        if (datas.size()>0){

            
            return new ResponseEntity<List<Data>>(datas,HttpStatus.OK);
        
    }else{
            return new ResponseEntity<>("No data available",HttpStatus.NOT_FOUND);
         }
    
    }

    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @PostMapping(value="add")
	public String addData(Data data)
	{
		dataRepository.save(data);
		return "redirect:/dashboard";
	}
	
    

}
