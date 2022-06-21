## Repositório da Disciplina de Desenvolvimento Web III
### TADS IFPR - Foz

### Aula 8


Aplicação web desenvolvida com a finaliada de testar os conceitos de Sessions e Cookies. Para tanto, a aplicação implementa um sistema de login. 

## Fluxo

Quando bem sucedido um login, a requisição do usuário é redirecionada para um aquivo index.jsp. Quando mal sucedido, a requisição retorna para a tela de login.jsp.

Ainda, existe uma servlet que realizada o processo de logout do sistema. O logout é realizado invalidando a sessão corrente, isto é, apagando os registro da sessão no servidor.
