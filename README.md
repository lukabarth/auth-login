
# Sistema de autenticação de usuários

Projeto de autenticação de usuários utilizando o Spring Security, onde só é possível fazer o login com o token gerado quando se cadastra.

OBS: O banco de dados é em memória, utilizando o H2 Database.
## Stack utilizada
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)




## Como usar
1. Inicie a aplicação usando Maven
2. A API poderá ser acessada em http://localhost:8080

## API Endpoints
A API possui os seguintes endpoints:
## GET
```bash
GET /user - Verifica se o usuário está autenticado (necessita do bearer token na aba de authorization).
```
```bash
Sucesso!
```

## POST
### Cadastro
```bash
POST /auth/register - Cadastra um usuário e gera o token de autenticação.
```

Para se cadastrar passe os parâmetros abaixo:
```bash
{
    "name": "Luka",
    "email": "teste@gmail.com",
    "password": "123456789"
}
```

Retorno
```bash
{
    "name": "Luka",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJsb2dpbi1hdRoLWFwaSIsInNYiI6InRlc3RlQGdtYWlsLNvbSIsImV4cCI6MTcxODEyMTAyMX0.DxSTOPGUdpysh48KnptlNy_e93P6XdSA3-vH8PUzatk"
}
```

### Login
```bash
POST /auth/login - Realiza o login.
```

Para realizar o login passe os parâmetros abaixo:
```bash
{
    "email": "teste@gmail.com",
    "password": "123456789"
}
```

Retorno
```bash
{
    "name": "Luka",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJsb2dpbi1hdRoLWFwaSIsInNYiI6InRlc3RlQGdtYWlsLNvbSIsImV4cCI6MTcxODEyMTAyMX0.DxSTOPGUdpysh48KnptlNy_e93P6XdSA3-vH8PUzatk"
}
```

