package propertiEditor;

import java.beans.PropertyEditorSupport;

public class NameProperties extends PropertyEditorSupport {
    @Override
    public void setAsText(String string) throws IllegalArgumentException {
       String myConvert = string.toUpperCase();
       setAsText(myConvert);
    }
}
