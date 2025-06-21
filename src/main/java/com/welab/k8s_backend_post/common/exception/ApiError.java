package com.welab.k8s_backend_post.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiError extends RuntimeException {
    protected String errorCode;
    protected String errorMessage;
}
