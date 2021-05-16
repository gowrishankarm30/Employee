package com.altimetrik.controller;


import com.altimetrik.entity.*;
import com.altimetrik.repository.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static java.util.Objects.isNull;

@RestController
public class EmployeeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/getEmployeeForProject/{id}")
    public ResponseEntity<Employee>  getEmployeeForProject(@PathVariable int id){

        if (id != 0) {
            logger.debug("Project id: "+id);
            Project p = projectRepository.findById(id);
            if(p != null && p.getDepartment().getEmployee() !=null) {
                logger.debug("Employee: "+ p.getDepartment().getEmployee());
                return new ResponseEntity<>(p.getDepartment().getEmployee(), HttpStatus.OK);
            } else {
                logger.debug("No employee found");
                return new ResponseEntity<>( HttpStatus.NO_CONTENT);
            }
        } else {
            logger.debug("No Project id");
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }

    }

}
