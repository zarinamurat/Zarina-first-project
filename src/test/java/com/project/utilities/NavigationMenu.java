package com.project.utilities;

import com.project.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Saule
 *
 * 
 */
public abstract class NavigationMenu {

    public NavigationMenu() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }
    
    
    
    
    
    
    
    
    
    
}

