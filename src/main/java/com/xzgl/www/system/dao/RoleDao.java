package com.xzgl.www.system.dao;


import com.xzgl.www.entity.Role;

import java.util.List;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface RoleDao {

    public void createRole(Role role);

    public void updateRole(Role role);

    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);

    public Role findByDescription(String description);

    public List<Role> findAll();
}
