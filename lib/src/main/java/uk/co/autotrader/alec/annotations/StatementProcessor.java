package uk.co.autotrader.alec.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StatementProcessor {

    private StatementProcessor() {
        //this should not get called
    }

    public static String execute(Object object) {
        Class<?> clazz = object.getClass();

        Method evaluate = null;
        Method ifTrue = null;
        Method ifFalse = null;

        if (!clazz.isAnnotationPresent(Conditional.class)) {
            throw new RuntimeException("The class "
                                       + clazz.getSimpleName()
                                       + " is not annotated with Conditional");
        }

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Evaluate.class)) {
                method.setAccessible(true);
                evaluate = method;
            }
            if (method.isAnnotationPresent(IfTrue.class)) {
                method.setAccessible(true);
                ifTrue = method;
            }
            if (method.isAnnotationPresent(IfFalse.class)) {
                method.setAccessible(true);
                ifFalse = method;
            }
        }

        try {
            if ((boolean) evaluate.invoke(object)) {
                return (String) ifTrue.invoke(object);
            } else {
                return (String) ifFalse.invoke(object);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
