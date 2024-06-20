FROM maven:3.8.5-openjdk-17-slim

WORKDIR /usr/src/app

COPY . .

CMD ["mvn", "javadoc:javadoc"]
