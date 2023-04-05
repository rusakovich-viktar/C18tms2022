//package by.tms.onlinestore.utils;
//
//import by.tms.onlinestore.exceptions.RequestParamNullException;
//
//import static org.apache.commons.lang3.StringUtils.isBlank;
//
//public class HttpRequestParamValidator {
//
//    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";
//
//    public static void validateParamNotNull(String param) throws RequestParamNullException {
//        if (isBlank(param)) {
//            throw new RequestParamNullException(REQUEST_PARAMETER_IS_NULL_ERROR);
//        }
//    }
//}
