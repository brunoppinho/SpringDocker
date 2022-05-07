# Docker Swarm

Possibilita a criação de um cluster de containers.

* Alta disponibilidade.
* Balanceamento de carga
* Comunicação criptografada

O Docker Swarm foi incluso dentro do docker a partir da versão 1.12.

## Comandos

Usage: docker swarm COMMAND

Manage Swarm

Commands:
ca Display and rotate the root CA init Initialize a swarm join Join a swarm as a node and/or manager join-token Manage
join tokens leave Leave the swarm unlock Unlock swarm unlock-key Manage the unlock key update Update the swarm

## Managers e Workers

Devemos sempre ter mais que um manager, pois se ficarmos sem manager o cluster estará totalmente indisponível.

Ambos conseguem rodar aplicações, porém o manager também é responsável por coordenar todo o cluster.

## Continuação

Aqui segue um link para treinar e praticar o uso do docker swarm. Ele vai ter mais informações para quem quer se
aprofundar no assunto.

https://imasters.com.br/desenvolvimento/vamos-conhecer-o-docker-swarm

# Docker Secrets

Solução do docker para trabalhar com secrets em um ambiente multi-node e multi-container.

A secret pode ser qualquer coisa que você queira armazenar em segredo, por exemplo, uma senha de banco de dados.

## Comandos

Usage:  docker secret COMMAND

Manage Docker secrets

Commands:
create Create a secret from a file or STDIN as content inspect Display detailed information on one or more secrets ls
List secrets rm Remove one or more secrets