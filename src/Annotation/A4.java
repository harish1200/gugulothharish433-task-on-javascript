package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

public class A4 {
public static void main(String args[])throws Exception
{
	Nokia obj=new Nokia("fire",5);
	
	Class<? extends Nokia> c=obj.getClass();
	Annotation an=(Annotation) c.getAnnotation(SmartPhone.class);
	SmartPhone s=(SmartPhone)an;
	System.out.println(s.os());
	
}
}

//marked Annotation
//single value  Annotation
//multivalued Annotation
//meta annotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone
{
	String os() default "mac";
	int version() default 1;
}

@SmartPhone(os = "andriod", version =6)
class Nokia
{
	String model;
	int size;
	public Nokia(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
}
