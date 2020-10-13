## 社区

## 资料
[Spring 文档](https://spring.io/guides)
[Spring.Web](https://spring.io/guides/gs/serving-web-content/)
[es](https://elasticsearch.cn/explore)
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

## 工具
[Git](https://git-scm.com/download)
[VP](https://www.visual-paradigm.com)
[Lombok](https://www.projectlombok.org)
[Markdown插件](http://editor.md.ipandao.com)

## 脚本
```sql
CREATE CACHED TABLE "PUBLIC"."USER"(
    "ID" INT DEFAULT NEXT VALUE FOR NOT NULL,
    "ACCOUNT_ID" VARCHAR(100),
    "NAME" VARCHAR(50),
    "TOKEN" CHAR(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
)
```

mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatismvn -Dmybatis.generator.overwrite=true mybatis-generator:generate-generator:generate


