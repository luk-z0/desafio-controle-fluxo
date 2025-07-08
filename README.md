# 🧮 Desafio: Contador em Java

[![Java](https://img.shields.io/badge/Java-21-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Status](https://img.shields.io/badge/status-finalizado-success?style=for-the-badge)](#)

Mais um desafio pra conta — que venham muitos outros! 🚀🔥

Este projeto é um exercício prático em Java que realiza uma contagem com base em dois parâmetros fornecidos pelo usuário via console. Ele também implementa uma exceção personalizada para validar regras de negócio.

> 📁 Repositório: [github.com/luk-z0/desafio-controle-fluxo](https://github.com/luk-z0/desafio-controle-fluxo)

---

## 📋 Descrição

O programa solicita dois valores inteiros do usuário:

- O **primeiro valor** representa o início da contagem.
- O **segundo valor** deve ser **maior que o primeiro**, indicando até onde a contagem deve ir.

Se o segundo valor for menor que o primeiro, uma exceção personalizada chamada `ParametrosInvalidosException` será lançada e tratada adequadamente.

---

## 🛠️ Tecnologias Utilizadas

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) ☕
- Terminal ou IDE (IntelliJ, VSCode, Eclipse...)

---

## 📂 Estrutura do Projeto

```
desafio-controle-fluxo/
│
├── src/
│   └── com/
│       └── contador/
│           ├── Contador.java
│           └── exception/
│               └── ParametrosInvalidosException.java
│
└── README.md
```

---

## 🚀 Como Executar

1. **Clone o repositório:**

```bash
git clone https://github.com/luk-z0/desafio-controle-fluxo.git
cd desafio-controle-fluxo
```

2. **Compile os arquivos Java:**

```bash
javac src/com/contador/**/*.java
```

3. **Execute o programa:**

```bash
java -cp src com.contador.Contador
```

---

## 📌 Exemplo de Uso

```
===========Contador==========

Digite o primeiro parâmetro:
2
Digite o segundo parâmetro:
5
Imprimindo número: 1
Imprimindo número: 2
Imprimindo número: 3
```

Se o segundo número for menor que o primeiro:

```
Erro: O segundo parâmetro deve ser maior que o primeiro
```

---

## ✅ Funcionalidades

- [x] Validação de parâmetros
- [x] Contagem entre valores válidos
- [x] Exceção personalizada com mensagem clara
- [x] Entrada via terminal com Scanner

---

## 👨‍💻 Autor

Desenvolvido por **[Lucas Gabriel](https://github.com/luk-z0)**  
💼 Repositório: [github.com/luk-z0/desafio-controle-fluxo](https://github.com/luk-z0/desafio-controle-fluxo)  
📅 Desafio concluído em **julho de 2025**

---

## 🏁 Que venham mais desafios!
