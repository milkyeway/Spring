package tw.jerry.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
	
	@Before(value="execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
	public void runBefore() {
//		System.out.println("��k�e����");
	}
	
	@After(value="execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
	public void runAfter() {
//		System.out.println("��k������");
	}
	
	@Around(value="execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("��k�e����");
		Object obj = joinpoint.proceed();
		System.out.println("��k�����");
		return obj;
	}
	
}
