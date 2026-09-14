# 🎬 Sistema de Ingressos

Sistema de gerenciamento de ingressos para cinemas, permitindo o gerenciamento de usuários, pedidos, pagamentos, sessões, filmes, salas e sistema de fidelidade.

## 📋 Sobre o projeto

O sistema tem como objetivo facilitar o processo de compra e gerenciamento de ingressos de cinema.

A aplicação permite que usuários realizem login, façam pedidos de ingressos, efetuem pagamentos por diferentes métodos e consultem informações sobre filmes e sessões disponíveis.

Além disso, o sistema possui um programa de fidelidade que permite aos usuários acumular e utilizar pontos.

---

## 🚀 Funcionalidades

### 👤 Usuário
- Cadastro de usuários
- Login e logout
- Atualização de dados pessoais
- Armazenamento de nome, e-mail, senha, telefone e data de nascimento

### 🎟️ Pedido
- Criação de pedidos
- Consulta dos detalhes do pedido
- Cálculo do valor total
- Cancelamento de pedidos
- Controle do status do pedido

### 💳 Pagamento
O sistema suporta diferentes formas de pagamento:

- PIX
- Cartão

Cada pagamento possui:
- Valor
- Status
- Data do pagamento
- Identificação do pedido

### 📱 PIX
- Geração de QR Code
- Geração de código PIX
- Verificação do status do pagamento

### 💳 Cartão
- Nome do titular
- Número do cartão
- Bandeira
- Parcelamento
- Código de autorização
- Validação da bandeira
- Autorização da compra

### 🎬 Filme
- Cadastro de filmes
- Título
- Sinopse
- Duração
- Classificação indicativa
- Gênero
- Consulta dos detalhes do filme

### 🕐 Sessão
- Cadastro de sessões
- Data e horário
- Formato
- Idioma
- Classificação
- Verificação da disponibilidade

### 🏢 Sala
- Número da sala
- Capacidade
- Tipo da sala
- Consulta de lugares disponíveis

### 🏙️ Cinema
- Cadastro de cinemas
- Nome
- Identificação
- Informações sobre o tipo de filial
- Consulta dos detalhes do cinema

### ⭐ Fidelidade
- Acúmulo de pontos
- Consulta da quantidade de pontos
- Utilização de pontos em compras

---

## 🧩 Diagrama UML

O sistema foi modelado utilizando um diagrama de classes UML.

![Diagrama UML do sistema](./DiagramaIngrexes.drawio%20(1).png)


### Principais classes

| Classe | Responsabilidade |
|---|---|
| `Usuario` | Gerenciamento dos dados e autenticação dos usuários |
| `Pedido` | Gerenciamento das compras e cálculo do valor total |
| `Pagamento` | Controle dos pagamentos |
| `Pix` | Processamento de pagamentos via PIX |
| `Cartao` | Processamento de pagamentos via cartão |
| `Filme` | Gerenciamento dos filmes |
| `Sessao` | Gerenciamento das sessões |
| `Sala` | Gerenciamento das salas e lugares |
| `Cinemas` | Gerenciamento dos cinemas |
| `Fidelidade` | Controle dos pontos de fidelidade |
| `StatusPedido` | Representação do status de um pedido |
| `StatusPagamento` | Representação do status de um pagamento |

---

## 🔗 Relacionamentos principais

- Um **Usuário** pode possuir vários **Pedidos**.
- Um **Usuário** possui um sistema de **Fidelidade**.
- Um **Pedido** possui um **Pagamento**.
- Um **Pagamento** pode ser realizado por **PIX** ou **Cartão**.
- Uma **Sessão** está associada a uma **Sala**.
- Uma **Sessão** está relacionada a um **Filme**.
- Um **Cinema** possui várias **Salas**.

---

## 🏗️ Estrutura do sistema

A arquitetura do sistema é baseada em classes responsáveis por diferentes partes do domínio:

```text
Usuário
   │
   ├── Pedido
   │     │
   │     └── Pagamento
   │           ├── Pix
   │           └── Cartão
   │
   └── Fidelidade

Cinema
   │
   └── Sala
         │
         └── Sessão
               │
               └── Filme
