## Build an Executable File

```bash
  mvn clean package
```

## Create Image from Dockerfile
```bash
  docker build --tag=simple-message:latest .
```

## Run the Container from Image
```bash
  docker run -p8080:8080 simple-message:latest
```