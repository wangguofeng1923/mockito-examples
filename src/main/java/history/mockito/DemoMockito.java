package history.mockito;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoMockito {
    public static final Map<MethodInfo, Object> MOCKED_METHODS = new HashMap<MethodInfo, Object>();
    
    public static MockInjector when(Object methodCall) {
    	System.out.println(methodCall);
        return new MockInjector((MethodInfo)methodCall);
    }
    
    private static DemoCGLibInterceptor getInterceptor() {
        return new DemoCGLibInterceptor();
    }

    public static void main(String[] args) {
        final List<String> myMockList1 = 
                (List<String>)getInterceptor().getInstance(List.class); 
        final List<String> myMockList2 = 
                (List<String>)getInterceptor().getInstance(List.class); 
        final Map<Integer, String> myMockMap = 
                (Map<Integer, String>)getInterceptor().getInstance(Map.class); 
        
        DemoMockito.when(myMockList1.get(0)).thenReturn("Hello, I am James");
        DemoMockito.when(myMockList1.get(2)).thenReturn("Hello, I am Billy");
        DemoMockito.when(myMockList2.get(0)).thenReturn("Hello, I am Tom");
        DemoMockito.when(myMockMap.get(10)).thenReturn("Hello, I am Bob");
        
        System.out.println("myMockList1.get(0) = " + myMockList1.get(0));
        System.out.println("myMockList1.get(2) = " + myMockList1.get(2));
        System.out.println("myMockList2.get(0) = " + myMockList2.get(0));
        System.out.println("myMockMap.get(10) = " + myMockMap.get(10));
    }
}