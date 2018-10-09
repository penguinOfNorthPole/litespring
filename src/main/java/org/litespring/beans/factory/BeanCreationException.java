package org.litespring.beans.factory;

import org.litespring.beans.BeansException;

/**
 * 创建Bean出错时抛出异常
 */
public class BeanCreationException extends BeansException {
    private String beanName;

    public BeanCreationException(String message) {
        super(message);
    }

    public BeanCreationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanCreationException(String beanName, String message) {
        super("Error creating bean with name '" + beanName + "': " + message);
        this.beanName = beanName;

    }

    public BeanCreationException(String beanName, String message, Throwable cause) {
        this(beanName, message);
        initCause(cause);
    }

    public String getBeanName() {
        return this.beanName;
    }
}
