# PeaceGod - Aplicativo de Apoio Espiritual

**PeaceGod** é um aplicativo desenvolvido com o objetivo de ajudar pessoas a lidarem com seus medos, ansiedades e preocupações, oferecendo versículos bíblicos inspiradores. O aplicativo fornece versículos aleatórios que podem ajudar o usuário a encontrar conforto e tranquilidade em momentos difíceis.

Este README contém uma explicação detalhada sobre como o aplicativo funciona, sua interface e as funcionalidades implementadas.

---

## Ícone do Aplicativo

![Ícone do PeaceGod](https://github.com/user-attachments/assets/d2864398-23e5-4fc6-a89b-7b49dcccab5f)

O ícone do aplicativo **PeaceGod** é composto por uma cesta com peixes, simbolizando a providência divina e a paz espiritual que o aplicativo busca transmitir aos seus usuários.

---

## Tela de Boas-Vindas

<img src="https://github.com/user-attachments/assets/6a7be971-c1ed-458e-8ad9-46e79c96d7c1" width="200" />

### **Descrição**

Ao abrir o aplicativo, o usuário verá uma tela inicial com a mensagem:

**"Vamos começar?"**

- **Campo "Qual seu nome?"**:
  - O usuário é solicitado a inserir seu nome. O nome é armazenado no cache do dispositivo, o que permite que o usuário seja reconhecido automaticamente em futuras visitas ao aplicativo, evitando a necessidade de digitar o nome toda vez que abrir o app.

---

## Validação de Campos

<img src="https://github.com/user-attachments/assets/7aab8f2a-761b-408d-805a-2a18f376ced5" width="200" />

### **Descrição**

Se o usuário tentar avançar sem inserir seu nome, o aplicativo exibirá um alerta de erro:

**Mensagem de erro**: “**Digite um nome!**”

Isso garante que o usuário não avance sem fornecer as informações necessárias para personalizar a experiência do aplicativo.

---

## Tela Principal - Exibição dos Versículos

<img src="https://github.com/user-attachments/assets/fc4a250b-e257-45bb-9a98-1ee45bd6f7d7" width="200" />

### **Descrição**

Após inserir o nome, o usuário será direcionado à tela principal, onde o versículo será exibido com a saudação personalizada:

**"Olá, [Nome]!"**

- **Campo de Versículo**:
  - O aplicativo exibe um versículo bíblico aleatório, oferecendo uma palavra de conforto e reflexão.

- **Botão "Nova Frase"**:
  - O usuário pode pressionar o botão para carregar um novo versículo sempre que desejar.

---

## Tela de Erro - Caso o conteúdo desejado dos versiculos não seja selecionado

<img src="https://github.com/user-attachments/assets/47d1bd8b-674e-45bb-901e-13c08700ed40" width="200" />

### **Descrição**

Se o usuário não preencher o campo do nome, o aplicativo exibirá o seguinte erro:

**Mensagem de erro**: “**Digite o tipo de versiculo que deseja ler abaixo!**”

Isso garante que a experiência do aplicativo seja personalizada e o usuário tenha acesso completo às funcionalidades.

---

## Tela de Versículo com Sugestões

<img src="https://github.com/user-attachments/assets/9fbea383-c3e4-4def-aed6-18772746495a" width="200" />
<img src="https://github.com/user-attachments/assets/fbfdecc6-26e3-4c9a-9aeb-c6279921db6e" width="200" />
<img src="https://github.com/user-attachments/assets/16ec0295-8f0e-48cc-96dd-1f719b26c0ff" width="200" />

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
3. **Escolha o Tema**: Se desejar, selecione o tipo de versículo que deseja ler (ex.: Ansiedade, Sabedoria, Amor).
4. **Veja o Versículo**: O aplicativo exibirá um versículo aleatório, e você pode clicar em **"Nova Frase"** para obter outro versículo.

---

Este **README.md** organiza o funcionamento do aplicativo de forma clara e profissional, destacando as imagens do app para melhor entendimento. Além disso, explica como o usuário interage com o app, suas funcionalidades e tecnologias usadas.
