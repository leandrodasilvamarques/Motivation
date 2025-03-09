# PeaceGod - Aplicativo de Apoio Espiritual

**PeaceGod** é um aplicativo desenvolvido com o objetivo de ajudar pessoas a lidarem com seus medos, ansiedades e preocupações, oferecendo versículos bíblicos inspiradores. O aplicativo fornece versículos aleatórios que podem ajudar o usuário a encontrar conforto e tranquilidade em momentos difíceis.

Este README contém uma explicação detalhada sobre como o aplicativo funciona, sua interface e as funcionalidades implementadas.

---

## Ícone do Aplicativo

![Ícone do PeaceGod](https://github.com/user-attachments/assets/d2864398-23e5-4fc6-a89b-7b49dcccab5f)

O ícone do aplicativo **PeaceGod** é composto por uma cesta com peixes, simbolizando a providência divina e a paz espiritual que o aplicativo busca transmitir aos seus usuários.

---

## Tela de Boas-Vindas

<img src="https://github.com/user-attachments/assets/a0b31e44-4f74-4965-bef5-229f58242940" width="300" />

### **Descrição**

Ao abrir o aplicativo, o usuário verá uma tela inicial com a mensagem:

**"Vamos começar?"**

- **Campo "Qual seu nome?"**:
  - O usuário é solicitado a inserir seu nome. O nome é armazenado no cache do dispositivo, o que permite que o usuário seja reconhecido automaticamente em futuras visitas ao aplicativo, evitando a necessidade de digitar o nome toda vez que abrir o app.

---

## Validação de Campos

<img src="https://github.com/user-attachments/assets/e1e77a48-df11-4470-9c02-196fc2efb15e" width="300" />

### **Descrição**

Se o usuário tentar avançar sem inserir seu nome, o aplicativo exibirá um alerta de erro:

**Mensagem de erro**: “**Digite um nome!**”

Isso garante que o usuário não avance sem fornecer as informações necessárias para personalizar a experiência do aplicativo.

---

## Tela Principal - Exibição dos Versículos

<img src="https://github.com/user-attachments/assets/4bc8c06b-5241-4196-8aac-22024ec5b657" width="300" />

### **Descrição**

Após inserir o nome, o usuário será direcionado à tela principal, onde o versículo será exibido com a saudação personalizada:

**"Olá, [Nome]!"**

- **Campo de Versículo**:
  - O aplicativo exibe um versículo bíblico aleatório, oferecendo uma palavra de conforto e reflexão.

- **Botão "Nova Frase"**:
  - O usuário pode pressionar o botão para carregar um novo versículo sempre que desejar.

---

## Tela de Erro - Caso o Nome Não Seja Inserido

<img src="https://github.com/user-attachments/assets/79a8b67d-55ae-4b93-a440-d61f48b0284d" width="300" />

### **Descrição**

Se o usuário não preencher o campo do nome, o aplicativo exibirá o seguinte erro:

**Mensagem de erro**: “**Digite um nome!**”

Isso garante que a experiência do aplicativo seja personalizada e o usuário tenha acesso completo às funcionalidades.

---

## Tela de Versículo com Sugestões

<img src="https://github.com/user-attachments/assets/162fe594-f658-4b1d-a6fc-2f3ff7ec4304" width="300" />

### **Descrição**

Na tela principal, após o usuário inserir seu nome, o aplicativo oferece diferentes versículos que podem ser relacionados aos sentimentos e necessidades do usuário. O aplicativo proporciona versículos relacionados a tópicos como:

- **Ansiedade**
- **Amor**
- **Sabedoria**

O usuário pode tocar no botão para selecionar o tipo de versículo que deseja ler, ajudando na personalização da experiência.

---

## Funcionalidades

- **Armazenamento de Nome no Cache**: O nome do usuário é salvo no cache do dispositivo, o que permite que o aplicativo personalize a experiência e evite a necessidade de digitar o nome toda vez que o usuário abrir o aplicativo.
- **Versículos Aleatórios**: O aplicativo oferece versículos aleatórios que são atualizados sempre que o usuário clica no botão **"Nova Frase"**.
- **Mensagens Personalizadas**: O nome do usuário é inserido na saudação para tornar a experiência mais pessoal e acolhedora.
- **Seleção de Tipos de Versículo**: O usuário pode escolher um tema para o versículo (ex.: Ansiedade, Sabedoria, Amor, etc.).

---

## Tecnologias Utilizadas

- **Linguagem de Programação**: Kotlin
- **Framework**: View Binding
- **Armazenamento Local**: Cache no dispositivo para salvar o nome do usuário.
- **Design Responsivo**: A interface foi desenvolvida para ser simples, intuitiva e de fácil uso, garantindo uma experiência fluida em diferentes tamanhos de tela.

---

## Como Usar

1. **Insira seu Nome**: Ao abrir o aplicativo, insira seu nome para personalizar a experiência.
2. **Clique em "SALVAR"**: Após inserir seu nome, clique em "SALVAR" para avançar para a tela de versículos.
3. **Veja o Versículo**: O aplicativo exibirá um versículo aleatório, e você pode clicar em **"Nova Frase"** para obter outro versículo.
4. **Escolha o Tema**: Se desejar, selecione o tipo de versículo que deseja ler (ex.: Ansiedade, Sabedoria, Amor).

---

Este **README.md** organiza o funcionamento do aplicativo de forma clara e profissional, destacando as imagens do app para melhor entendimento. Além disso, explica como o usuário interage com o app, suas funcionalidades e tecnologias usadas.

Se precisar de mais ajustes, é só avisar!
