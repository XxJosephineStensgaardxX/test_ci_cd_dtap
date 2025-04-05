package main.java.com.example;

public class EnvironmentService {
    private String environment;

    public EnvironmentService(String environment) {
        this.environment = environment;
    }

    public String getEnvironmentMessage() {
        switch (environment.toLowerCase()) {
            case "development":
                return "Welcome to Development Environment";
            case "test":
                return "Welcome to Test Environment";
            case "acceptance":
                return "Welcome to Acceptance Environment";
            case "production":
                return "Welcome to Production Environment";
            default:
                return "Unknown Environment";
        }
    }

    public boolean isEnvironmentValid() {
        return environment != null && !environment.trim().isEmpty() &&
                (environment.equalsIgnoreCase("development") ||
                        environment.equalsIgnoreCase("test") ||
                        environment.equalsIgnoreCase("acceptance") ||
                        environment.equalsIgnoreCase("production"));
    }
}
