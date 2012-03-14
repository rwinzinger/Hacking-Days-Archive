package winzinger.poc.tef.felixintegration;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.osgi.context.BundleContextAware;
import org.springframework.osgi.context.support.BundleContextAwareProcessor;

public class BundleContextPostProcessor extends BundleContextAwareProcessor {
	Logger logger = Logger.getLogger("MyBeanPostProcessor");

	public BundleContextPostProcessor() {
		super(BundleContextHolder.getInstance().getBundleContext());
		logger.info("initializied PostProcessor");
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		logger.info("after init ("+bean.toString()+")");
		return super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		logger.info("before init ("+bean.toString()+")");
		if (bean instanceof BundleContextAware) {
			logger.info("found bundle-context-aware bean");
			((BundleContextAware)bean).setBundleContext(BundleContextHolder.getInstance().getBundleContext());
		}
		return super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
}
