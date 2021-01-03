package tr.test;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "todoConverter")
@ManagedBean(name = "todoConverter")
public class TodoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        DualListModel<Todo> model = (DualListModel<Todo>) ((PickList)uiComponent).getValue();
        return model.getSource().stream().filter(todo -> todo.getId().equals(s)).findFirst().orElseGet(()
                -> model.getTarget().stream().filter(todo -> todo.getId().equals(s)).findFirst().orElse(null));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Todo)o).getId();
    }
}
