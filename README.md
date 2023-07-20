# Quarkus

- redhat
- criado em 2019
- k8s native
- graal vm
- era cloud
- baixo consumo de memoria, modo desenvolvedor
- imperativo e reativo (eventos)
- extenções (possibilidade de usar injection do spring, por exemplo)
- criar imagem nativa com build tools

## GraalVM

- imagem nativa (existe community e enterprise)
- Como criar imagem nativa:
  - instalar vs_buildtools e instalar dependencias (compiladores, vc++, c++/cli, sdk win 10)
  - instalar componente .jdks\graalvm-ce-17\bin> .\gu.cmd install native-image
  - executar:
  ```shell
  cmd /c 'call "C:\Program Files (x86)\Microsoft Visual Studio\2017\BuildTools\VC\Auxiliary\Build\vcvars64.bat" && mvn package -Dnative'
  ```
- JIT para rodar JVM aplicações e ahead-of-time compiler para native images
- native image:
  - fast-startup = ideal para funcões serverless e aplicações de vida curta
  - footprint menor = menor uso de disco, deploy rapido e rapido startup
  - interoperabilidade entre python, ruby, r, js, etc
  - Avisos sobre native image:
    - nem tudo é possivel com graal, como reflections e dynamic class loading
    - pode n performar tao bem em long-running apps, pra isso JIT é melhor
    - AOT compilation demora mais e usa mais memoria que JIT compilation
  - bom para microserviços, serverless e cli
- Mandrel = usado para construir imagem nativa de quarkus (usa graal ce)

## ex de pom profile para gerar nativo
```xml
<profiles>
<profile>
<id>native</id>
<properties>
<quarkus.package.type>native</quarkus.package.type>
</properties>
</profile>
</profiles>
```

## Commands

- mvnw compile quarkus:dev // roda em modo dev
- mvnw install quarkus:dev