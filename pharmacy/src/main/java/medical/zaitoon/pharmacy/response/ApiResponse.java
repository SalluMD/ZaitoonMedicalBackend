package medical.zaitoon.pharmacy.response;

import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {
    private HttpStatus status;
    private String message;
    private Object data;
    private String error;

    // Constructors
    public ApiResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(HttpStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(HttpStatus status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
    }

    // Getters and Setters
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    // Helper methods to create responses
    public static ApiResponse success(String message) {
        return new ApiResponse(HttpStatus.OK, message);
    }

    public static ApiResponse success(String message, Object data) {
        return new ApiResponse(HttpStatus.OK, message, data);
    }

    public static ApiResponse error(HttpStatus status, String message) {
        return new ApiResponse(status, message);
    }

    public static ApiResponse error(HttpStatus status, String message, String error) {
        return new ApiResponse(status, message, error);
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}