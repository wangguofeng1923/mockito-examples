package history.mockito;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodInfo {
    private final DemoCGLibInterceptor interceptor;
    private final Method method;
    private final Object[] args;
    public MethodInfo(DemoCGLibInterceptor interceptor,Method method,Object[] args){
    	this.interceptor=interceptor;
    	this.method=method;
    	this.args=args;
    	
    }
    @Override
    public String toString() {
        return "{interceptor: " + interceptor + ", Method: " + method + ", args: " + Arrays.toString(args) + "}";
    }
    
    @Override
    public boolean equals(final Object other) {
        if (other instanceof MethodInfo) {
            final MethodInfo otherMethodInfo = (MethodInfo)other;
            return interceptor.equals(otherMethodInfo.interceptor) && method.equals(otherMethodInfo.method) && Arrays.equals(args, otherMethodInfo.args);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return interceptor.hashCode() + method.hashCode() + Arrays.hashCode(args);
    }
}