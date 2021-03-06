/*
 * Copyright 2008 Shine Technologies Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package com.shinetech.client.screen;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.shinetech.client.IMemberDetailsGWTService;
import com.shinetech.client.IMemberDetailsGWTServiceAsync;

/*
 * @author Stephen Callaghan
 */
public class BaseScreen extends VerticalPanel
{
    protected static IMemberDetailsGWTServiceAsync svcMemberDetailsAsync;

    static
    {
        // Setup Service Endpoint
        svcMemberDetailsAsync = (IMemberDetailsGWTServiceAsync)GWT
                .create(IMemberDetailsGWTService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svcMemberDetailsAsync;
        endpoint.setServiceEntryPoint(GWT.getModuleBaseURL() + "service");
    }

    protected FocusWidget focusWidget;
    
    public void setFocus()
    {
        if (focusWidget != null)
        {
            focusWidget.setFocus(true);
        }
    }

}
