package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 可以借助swagger的注解实现,也可以自定义
 * 主要为了生成字段中文名称
 *
 * @author RongTongXin
 * @date 2021/7/1 下午2:07
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiModelProperty {
    String value() default "";
}
