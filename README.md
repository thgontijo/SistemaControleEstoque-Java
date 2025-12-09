# 🏪 Sistema de Controle de Estoque Java

Aplicação em Java para gerenciar produtos, permitindo cadastro, listagem, atualização de estoque, busca e remoção. O sistema utiliza coleções, ordenação, validações e tratamento de exceções para garantir integridade dos dados.

---

## 🚀 Funcionalidades

- Cadastro de produtos com **ID**, **nome**, **preço** e **quantidade**
- Aumento ou redução de estoque
- Bloqueio de operações que gerem quantidade negativa
- Verificação de existência antes de modificar estoque
- Remoção de produto informando apenas o ID
- Tratamento de exceções e validação das entradas do usuário

---

## 💻 Tecnologias Utilizadas

- **Java**
- **Collections API** (List, Comparator)
- **Scanner**

---

## 📦 Instalação

```bash
# Clonar o repositório
git clone https://github.com/thgontijo/sistema-estoque-java.git

# Entrar na pasta do projeto
cd sistema-estoque-java

# Compilar o projeto
javac -d bin src/**/*.java

# Executar o projeto
java -cp bin main.Main
```
---

## 📝 Como Usar

1. Execute o programa.
2. Escolha uma opção do menu:
   - Cadastrar produto
   - Listar produtos
   - Atualizar estoque (aumentar ou diminuir)
   - Buscar produto por ID
   - Remover produto

3. Para atualizar o estoque:
   - Informe o **ID**
   - O sistema verifica se o produto existe
   - O sistema valida se a alteração é permitida  
     (ex.: impedir quantidade negativa)

A lista permanece sempre ordenada após qualquer modificação.

---

## 👨‍💻 Autor

**Thyago Gontijo**  
GitHub: https://github.com/thgontijo

---

## ⚠️ Aviso

Este projeto foi desenvolvido exclusivamente para estudo e prática da API de coleções do Java.  
Não deve ser utilizado como sistema real de controle de estoque em ambientes comerciais.
