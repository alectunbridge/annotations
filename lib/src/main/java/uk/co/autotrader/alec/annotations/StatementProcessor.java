package uk.co.autotrader.alec.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StatementProcessor {
    public void execute(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = object.getClass();

        Method evaluate = null;
        Method ifTrue = null;
        Method ifFalse = null;
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

        if((boolean) evaluate.invoke(object)){
            ifTrue.invoke(object);
        } else {
            ifFalse.invoke(object);
        }
    }
}
