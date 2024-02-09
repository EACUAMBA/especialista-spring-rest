# Spring vs Jakarta EE

## Jakarta EE (Java EE) JEE

* Defini especificações (exemplo JPA, HIbernate é uma das implementações JPA);
* Com especificações não temos **vendor lock-in** agora podemos mudar as implementações, do hibernate para EclipseLink;
* Estavel, Portavel, 

## Spring

* Plataforma inovadora;
* Tem objectivo de inovar;
* Entre inovação e portabilidade, os devs do spring escolhe inovação;

## Qual escolher?

* Spring Data JPA utiliza JPA um especificação do JEE;
* Spring utiliza especificações como Servlets do JEE;
* Ainda assim temos concorencia (exemplo para trabalhar com injeção de dependencia IoC, no Spring temos o proprio Spring e no JEE temos o CDI, para APIs REST temos o Spring MVC e no JEE temos Jax-RS)
* Vamos aprender o que precisamos com o tempo e não tudo de uma vez;