/* Cerberus Copyright (C) 2013 - 2017 cerberustesting
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This file is part of Cerberus.

 Cerberus is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Cerberus is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.*/
package org.cerberus.crud.service;

import java.util.List;
import java.util.Map;
import org.cerberus.crud.entity.DashboardGroup;
import org.cerberus.crud.entity.User;
import org.cerberus.dto.DashboardGroupDTO;
import org.cerberus.dto.DashboardTypeIndicatorDTO;
import org.cerberus.engine.entity.MessageEvent;
import org.cerberus.enums.MessageEventEnum;

/**
 *
 * @author utilisateur
 */
public interface IDashboardGroupService {

    public List<DashboardGroup> readByUser(User user);

    public Map<String, Object> readDashboard(User user);

    public DashboardGroupDTO dashboardGroupEntriesToDTO(DashboardGroup dashboardGroupEntries);

    public Integer create(DashboardGroup dashboardGroup);

    public MessageEvent cleanByUser(User user);

    public List<DashboardTypeIndicatorDTO> readDashboardPossibility();
    
    public List<MessageEvent> updateDashboard(List<DashboardGroupDTO> dashboardGroup, User user);
    
    public MessageEvent checkDashboardIntegrity(List<DashboardGroupDTO> listGroup);
}
