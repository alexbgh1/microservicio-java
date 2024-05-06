# microservicio-java

This application is a simple microservice made in **Java 8**, **Spring Boot** & **Maven** that returns a greeting message.

The purpose of this project is to create a pipeline-ci using **[Github Actions](https://docs.github.com/es/actions)**, with different tools and software like **[SonarCloud](https://sonarcloud.io/)**, **[Docker](https://www.docker.com/)**, **[Kubernetes](https://kubernetes.io/)**, **[JMeter](https://jmeter.apache.org/usermanual/get-started.html)** and **[Postman (newman)](https://learning.postman.com/docs/collections/using-newman-cli/command-line-integration-with-newman/)**

## Setup

### SonarCloud

1. Create a new organization in SonarCloud, e.g. `username`
2. Create a new project in SonarCloud, e.g. `microservicio-java`
3. Generate a new token in SonarCloud

### Docker

1. Create a new repository in DockerHub, e.g. `username/microservicio-java`
2. Generate a new token in DockerHub (or use your username and password)

### Tokens

At this point you should have the following tokens:

- [x] SONAR_TOKEN
- [x] DOCKER_PASS
- [x] DOCKER_USER

These tokens will be used in the Github Actions workflow.

You can add these tokens in the Github repository in
`Settings > Secrets and variables > Actions`

**At this point...**

The entire job `build` is ready to be executed in the Github Actions workflow.

### Deploy

The `deploy` pipeline is running in a `self-hosted` machine, you can setup your own machine. In this case, the machine is running on `Windows 11`.

The software necesary to run the `deploy` pipeline is:

- [x] **Kubernetes** (can be downloaded using Docker Desktop > Settings > Kubernetes > Enable Kubernetes)
- [x] **JMeter** (current path: `C:\apache-jmeter-5.6.3\bin\jmeter.bat`)
- [x] **Postman (newman)**

## Considerations

- You can adjust the `coverage` in the `jacoco_reporter` step, and the `quality gate` in **SonarCloud** by changing the parameters.

- By default, **SonarCloud** is using `short-lived` branches, so it will analyze the "new code" in the branch.
