package history.mockito;

public class MockInjector {
    private final MethodInfo methodInfo;
    public MockInjector(MethodInfo methodInfo){
    	this.methodInfo=methodInfo;
    }
    public void thenReturn(final Object mockResult) {
        DemoMockito.MOCKED_METHODS.put(methodInfo, mockResult);
    }
}
