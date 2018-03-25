/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.propertysections;

import com.archimatetool.model.IDiagramModelGroup;


/**
 * Property Section for a Group
 * 
 * @author Phillip Beauvoir
 */
public class GroupSection extends AbstractNameDocumentationSection {
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return object instanceof IDiagramModelGroup;
        }

        @Override
        public Class<?> getAdaptableType() {
            return IDiagramModelGroup.class;
        }
    }

    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
    

}
