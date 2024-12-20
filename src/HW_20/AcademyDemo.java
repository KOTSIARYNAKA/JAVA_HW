
package HW_20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AcademyDemo {
    public static void main(String[] args) {

            Class<AcademyMethods> courseClass = AcademyMethods.class;

            for (Method method : courseClass.getDeclaredMethods()) {

                if (method.isAnnotationPresent(AcademyInfo.class)) {
                    AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
                    System.out.println("Метод: " + method.getName() + ", Год: " + academyInfo.year());
                } else {
                    System.out.println("Метод: " + method.getName() + " не имеет аннотации AcademyInfo.");
                }
            }
        }
    }