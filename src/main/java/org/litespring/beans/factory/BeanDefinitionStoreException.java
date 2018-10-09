package org.litespring.beans.factory;

import org.litespring.beans.BeansException;

/**
 * 读取xml文件出错时抛出异常
 */
public class BeanDefinitionStoreException extends BeansException {

    public BeanDefinitionStoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
