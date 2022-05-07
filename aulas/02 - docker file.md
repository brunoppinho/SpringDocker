# Dockerfile

Arquivo onde você determina todos os detalhes para construção e execução de um container.

* Imagem usada como base
* Aplicativos a serem instalados
* Comandos a serem executados
* Volumes montados
* Configuração de memória e cpu

# Hello Docker

* Crie uma pasta chamada *primeiro*
* Crie um arquivo com nome de *Dockerfile*
* Adicione na primeira linha qual a imagem que será utilizada de base
    * FROM debian
* Adicione qual comando será executado
    * RUN /bin/echo "HELLO DOCKER"

Arquivo criado: [Dockerfile](../dockerfiles/primeiro/Dockerfile)

Execute o comando *docker build* para criar a imagem de container.

> docker build -t hello:1.0 .

# Exemplo Apache

Nesse momento iremos criar uma imagem mais complexa que será utilizado o Servidor web Apache como base.

[Dockerfile](../dockerfiles/apache/Dockerfile)

## Build

> docker build . -t letscode/apache:1.0

O parâmetro -t vai passar uma tag com o nome e a versão da imagem criada

## Execução

> docker container run -ti -p 8183:80 letscode/apache:1.0

Teste localhost:8183 para verificar se o servidor apache está funcionando.

Caso apareça o erro: *failed to solve with frontend dockerfile.v0: failed to create LLB definition: failed to authorize:
rpc error: code = Unknown desc = failed to fetch oauth token:
Get "https://auth.docker.io/token?scope=repository%3Alibrary%2Fdebian%3Apull&se*

Utilize o link como
consulta: https://stackoverflow.com/questions/65361083/docker-build-failed-to-fetch-oauth-token-for-openjdk

# Exercício Spring Boot

Criar uma aplicação simples Spring Boot aonde deve conter pelo menos um controller devolvendo alguma mensagem.

Criar o dockerfile da aplicação e executar a aplicação no docker.

[Dockerfile Spring](../Dockerfile)

## Build

> docker build . -t letscode/spring-docker:0.1

O parâmetro -t vai passar uma tag com o nome e a versão da imagem criada

## Execução

> docker container run -ti -p 8585:8585 letscode/spring-docker:0.1

# Construindo o dockerfile

* VOLUME — Volume a ser montado no container

* FROM — Imagem que servirá de base, será sempre a primeira linha do arquivo
* COPY — Copia arquivos e adiciona ao filesystem do container
* ADD — Semelhante ao ADD porém suporta a adição de arquivos via URL ou via tar(auto-extrair)
* RUN — Comandos a serem executados na imagem em tempo de build
* CMD — Executa um comando quando o container for iniciado.
* ENTRYPOINT — Executável que será executado ao iniciar o container, quando ele terminar o container será finalizado;
    * O CMD pode conter parâmetros do comando a ser executado no entrypoint
* LABEL — Metadata da imagem, ex: descrição
* ENV — Variáveis de ambiente
* EXPOSE — Informa a porta que o container vai ouvir
* MAINTAINER — Autor da imagem
* User — Usuário utilizado na imagem. O padrão é *root*
* VOLUME — Cria um ponto de montagem no container
* WORKDIR — Altera a pasta a ser trabalhada