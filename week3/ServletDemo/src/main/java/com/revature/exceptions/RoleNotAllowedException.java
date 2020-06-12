package com.revature.exceptions;

public class RoleNotAllowedException extends AuthorizationException {
	private static final long serialVersionUID = -5372184007618801375L;

	public RoleNotAllowedException() {
	}

	public RoleNotAllowedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RoleNotAllowedException(String message, Throwable cause) {
		super(message, cause);
	}

	public RoleNotAllowedException(String message) {
		super(message);
	}

	public RoleNotAllowedException(Throwable cause) {
		super(cause);
	}
}
