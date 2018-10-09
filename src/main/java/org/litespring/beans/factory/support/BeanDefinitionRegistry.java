package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * 注册bean的定义
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanId, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanId);
}
