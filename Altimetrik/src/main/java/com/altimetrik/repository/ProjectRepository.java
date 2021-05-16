package com.altimetrik.repository;

import com.altimetrik.entity.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import javax.persistence.*;
import java.util.*;

@Repository
@Transactional
public class ProjectRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager entityManager;

    public Project findById(int id) {

        logger.debug("Project id: " + id);

        return entityManager.find(Project.class, id);
    }





}
