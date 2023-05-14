bash
Copy code
# Spring Boot - Docker

Sample spring boot application containing GET endpoints

- http://localhost:8080/welcome
- http://localhost:8080/health

## Steps

- Create a Spring Boot Application with a REST controller and endpoints.
- Create a GitHub Action workflow for build and test using Maven.
- Add Docker credentials in secret and provide repository name.
- Pull the image from Docker Hub to a local environment.

## Follow these commands for Docker

To pull the image

```
docker pull naruto22/spring-docker
```

To verify the image in local
```
docker images
```

Run the image
```
docker run -p 8080:8080 naruto22/spring-docker
```