package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import com.rohit.config.AppConfig;
import com.rohit.model.Student;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student studentBean1 = context.getBean("s1", Student.class);
		Student studentBean2 = context.getBean("s1", Student.class);

		System.out.println("..........singleton test ..............");
		System.out.println("hashcode of studentBean1 :" + studentBean1.hashCode());
		System.out.println("hashcode of studentBean2 :" + studentBean2.hashCode());
		Assert.isTrue(studentBean1 == studentBean2, "studentbean1 and studentbean2 refers" + " to different object");

		System.out.println("..........ProtoType Scope Test.........");
		Student studentBean3 = context.getBean("s2", Student.class);
		Student studentBean4 = context.getBean("s2", Student.class);
		System.out.println("hashcode of studentBean1 :" + studentBean3.hashCode());
		System.out.println("hashcode of studentBean2 :" + studentBean4.hashCode());
		Assert.isTrue(studentBean3 != studentBean4, "studentBean3 should not be refers to studentBEan4");

		Student s3first = context.getBean("s3", Student.class);
		Student s3second = context.getBean("s3", Student.class);

		System.out.println(Thread.currentThread().getName()+" >  s3first==s3second " + (s3first == s3second));

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				Student s3first = context.getBean("s3", Student.class);
				Student s3second = context.getBean("s3", Student.class);
				System.out.println(Thread.currentThread().getName()+" > s3first==s3second " + (s3first == s3second));
			}

		});
		t1.start();
		
		
	}
}
