/*
 * JSF CRUD project.
 * Copyright (C) 2020 e-Contract.be BV.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see
 * http://www.gnu.org/licenses/.
 */
package be.e_contract.crud.jsf;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;

@FacesComponent(value = "crud.delete")
public class DeleteComponent extends UIComponentBase {

    public enum PropertyKeys {
        disabled,
        deleteAll,
    }

    @Override
    public String getFamily() {
        return "crud";
    }

    public boolean isDisabled() {
        Boolean disabled = (Boolean) getStateHelper().get(PropertyKeys.disabled);
        if (null == disabled) {
            return false;
        }
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        getStateHelper().put(PropertyKeys.disabled, disabled);
    }

    public boolean isDeleteAll() {
        Boolean deleteAll = (Boolean) getStateHelper().get(PropertyKeys.deleteAll);
        if (null == deleteAll) {
            return false;
        }
        return deleteAll;
    }

    public void setDeleteAll(boolean deleteAll) {
        getStateHelper().put(PropertyKeys.deleteAll, deleteAll);
    }
}
