# Literatura Pública

## Descrição
O **Literatura Pública** é um projeto desenvolvido como parte do Trabalho de Conclusão de Curso (TCC). Trata-se de uma plataforma online para leitura e exploração de livros, permitindo aos usuários pesquisar obras e autores, salvar livros, avaliar e comentar leituras, e muito mais. O objetivo é criar uma experiência interativa e envolvente para amantes da leitura.

## Tecnologias Utilizadas
- **Backend:** Java com Spring Boot (MVC), Maven, PostgreSQL
- **Frontend:** Angular
- **Banco de Dados:** PostgreSQL
- **Armazenamento de Arquivos:**
  - Capas de livros e fotos de autores: Armazenadas no frontend (assets/images)
  - PDFs dos livros: Armazenados na pasta `static` do backend

## Estrutura do Projeto

### Backend
Localizado na pasta `backend`, estruturado conforme o padrão MVC:
```
backend/src/main/java/org/literatura/publica
├── controller/       # Controladores para gerenciamento de requisições HTTP
├── model/            # Modelos de entidades do banco de dados
├── repository/       # Interfaces para acesso ao banco de dados
├── service/          # Regras de negócio e lógica de serviço
└── config/           # Configurações adicionais do projeto
LiteraturaPublicaApplication.java # Classe principal
```

### Frontend
Localizado na pasta `frontend`, organizado por módulos:
- **Core**: Componentes essenciais e compartilhados
- **User**: Gerenciamento de usuários e perfis
- **Books**: Exibição e interação com livros
- **Authors**: Visualização de autores e informações
- **Reading**: Funcionalidades de leitura e progresso

## Funcionalidades

### Usuário Não Logado
- Pesquisa de livros e autores
- Visualização de informações sobre livros e autores
- Acesso a avaliações e comentários
- Possibilidade de criar conta e fazer login

### Usuário Logado
- Salvar livros e continuar leitura
- Avaliar e comentar livros
- Seguir autores e criar playlists
- Atualizar perfil e marcar progresso de leitura
- Acessar histórico de leitura

### Funcionalidades do Sistema
- Cálculo automático de média e contagem de avaliações
- Registro de popularidade de livros e padrões de leitura
- Recomendação de livros com base no histórico do usuário
- Registro automático do último acesso aos livros

## Banco de Dados
O banco de dados é implementado em PostgreSQL, com tabelas otimizadas para desempenho, incluindo índices em:
- `user_preferences(user_id)`, para otimizar buscas por preferências do usuário
- `book_ratings`, permitindo apenas uma avaliação por livro por usuário

## Configuração e Execução
### Backend
1. Instale as dependências do Maven:
   ```sh
   mvn clean install
   ```
2. Configure o PostgreSQL e atualize o `application.properties` com as credenciais corretas.
3. Execute o servidor Spring Boot:
   ```sh
   mvn spring-boot:run
   ```

### Frontend
1. Instale as dependências do Angular:
   ```sh
   npm install
   ```
2. Inicie o servidor Angular:
   ```sh
   ng serve
   ```
3. Acesse a aplicação em `http://localhost:4200/`

## Contato
Caso tenha dúvidas ou sugestões, entre em contato pelo e-mail: **[brunogarciafagundes@gmail.com]**

