package app

import com.vaadin.grails.navigator.VaadinView
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout
import org.springframework.beans.factory.annotation.Autowired

@VaadinView(path = "item")
class ItemView extends VerticalLayout implements View {

    @Autowired
    ItemService itemService

    @Override
    void enter(ViewChangeListener.ViewChangeEvent e) {
        setMargin(true)

        String label = itemService.serviceMethod()
        addComponent(new Label(label))
    }
}
