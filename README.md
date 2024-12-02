# Sistema de Envio de Emails com Quarkus

---

## **Visão Geral**
Este projeto demonstra um sistema simples de envio de emails utilizando Quarkus. Ele suporta o envio de emails com anexos opcionais através de um servidor SMTP. O sistema segue um design modular, facilitando a extensão ou troca para outros serviços de envio de emails.

---

## **Funcionalidades**
- **Suporte a Anexos**: Permite o envio de emails com anexos.
- **Campo Dinâmico**: O campo `from` é configurável; entretanto, muitos servidores SMTP sobrescrevem este campo e utilizam o endereço de email do usuário autenticado.

---

## **Como Funciona**

1. **Controller**: Expõe um endpoint REST (`/mail/send`) para envio de emails.
3. **Integração com o Mailer**: Utiliza o `io.quarkus.mailer.Mailer` do Quarkus para interagir com o servidor SMTP.

---

## **Exemplo de Requisição**

```bash
curl -X POST http://localhost:8080/mail/send \
-H "Content-Type: application/json" \
-d '{
  "from": "remetente@teste.com",
  "recipient": "andreytondo@alunos.utfpr.edu.br",
  "subject": "Titulo",
  "content": "Conteudo"
}'
```