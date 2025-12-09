🏪 Sistema de Controle de Estoque (Java)

Projeto em Java para gerenciar produtos, permitindo cadastro, consulta, atualização de estoque e remoção. Usa listas, ordenação, busca por ID, validações e tratamento de exceções.

🚀 Funcionalidades

Cadastrar produtos com ID, nome e quantidade

Listar produtos ordenados por ID ou nome

Aumentar ou diminuir estoque

Validação para impedir quantidade negativa

Verificação antes de reduzir estoque

Buscar produto pelo ID

Remover produto informando apenas o ID

Persistência opcional (se você tiver implementado)

Tratamento de exceções e validação de entradas do usuário

💻 Tecnologias

Java

Collections API (List, Comparator)

Scanner (entrada do usuário)

📦 Instalação
# Clonar o repositório
git clone https://github.com/thgontijo/sistema-estoque-java.git

# Entrar na pasta do projeto
cd sistema-estoque-java

# Compilar o projeto
javac -d bin src/**/*.java

# Executar o projeto
java -cp bin main.Main

📝 Como usar

Execute o programa.

Escolha uma das opções do menu:

Cadastrar produto

Listar produtos

Atualizar estoque (aumentar ou diminuir)

Remover produto

Buscar por ID

Para atualizar estoque:

Informe o ID

O sistema valida se o produto existe

Depois valida se a operação é possível (ex.: não deixar quantidade negativa)

O sistema mantém a lista sempre ordenada (se configurado dessa forma).

👨‍💻 Autor

Thyago Gontijo – GitHub: https://github.com/thgontijo

⚠️ Aviso

Este projeto foi desenvolvido apenas para aprendizado pessoal, prática da API de coleções do Java e reforço de lógica de programação.
Não deve ser usado como sistema de estoque real em ambientes comerciais.
