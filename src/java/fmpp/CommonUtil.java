package fmpp;

import java.util.Map;

import freemarker.ext.beans.BeansWrapper;
import freemarker.template.TemplateModelException;

public final class CommonUtil {

	    /**
	     * 往model中填充class
	     * 
	     * @param model
	     * @param clz
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    public static Object putStaticModel(Map model, Class clz) {
	        BeansWrapper wrapper = BeansWrapper.getDefaultInstance();
	        try {
	            model.put(clz.getSimpleName(),
	                    wrapper.getStaticModels().get(clz.getName()));
	        } catch (TemplateModelException e) {
	            e.printStackTrace();
	        }
	        return model;
	    }

}
