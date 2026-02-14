# Use official OpenJDK image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Compile Java files
RUN javac Main.java

# Run the application
CMD ["java", "Main"]
