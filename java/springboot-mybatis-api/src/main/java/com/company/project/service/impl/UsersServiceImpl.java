package com.company.project.service.impl;

import com.company.project.dao.UsersMapper;
import com.company.project.model.Users;
import com.company.project.service.UsersService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/28.
 */
@Service
@Transactional
public class UsersServiceImpl extends AbstractService<Users> implements UsersService {
    @Resource
    private UsersMapper usersMapper;

}
