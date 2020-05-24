## 安装jdk11

## 安装maven

## 安装lombok

## 使用maven构建prod环境

```shell
mvn clean install package -Dmaven.test.skip=true -Pprod
```

## 使用springboot启动prod环境

```shell
java -Xms256m -Xmx512m -jar target/media-browers-0.0.1-SNAPSHOT.war --spring.profiles.active=prod
```