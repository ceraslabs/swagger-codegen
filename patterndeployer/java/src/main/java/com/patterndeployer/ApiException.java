package com.patterndeployer;

public class ApiException extends Exception {
  int code = 0;
  String message = null;
  String serverTrace = null;

  public ApiException() {}

  public ApiException(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public ApiException(int code, String message, String trace) {
    this.code = code;
    this.message = message;
    this.serverTrace = trace;
  }

  public int getCode() {
    return code;
  }
  
  public void setCode(int code) {
    this.code = code;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }

  public String getServerTrace() {
    return serverTrace;
  }

  public void setServerTrace(String trace) {
    this.serverTrace = trace;
  }
}
