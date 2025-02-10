package uk.co.autotrader.alec.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class StatementProcessor {

    public String execute(Object object) {
        Class<?> clazz = object.getClass();

        Method evaluate = null;
        Method ifTrue = null;
        Method ifFalse = null;
        Method execute = null;
        List<String> result = new ArrayList<>();

        if (!clazz.isAnnotationPresent(Conditional.class) && !clazz.isAnnotationPresent(Loop.class)) {
            return object.toString();
        }

        if (clazz.isAnnotationPresent(Conditional.class)) {

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
                    return execute(ifTrue.invoke(object));
                } else {
                    return execute(ifFalse.invoke(object));
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        if (clazz.isAnnotationPresent(Loop.class)) {
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Evaluate.class)) {
                    method.setAccessible(true);
                    evaluate = method;
                }
                if (method.isAnnotationPresent(Execute.class)) {
                    method.setAccessible(true);
                    execute = method;
                }
            }

            while (true) {
                try {
                    if (!(boolean) evaluate.invoke(object)) break;
                    result.add(execute(execute.invoke(object)));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return String.join(", ", result);
    }
}
