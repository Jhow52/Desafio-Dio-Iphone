# 📱 Modelagem UML e Implementação Java do Componente iPhone

Este repositório contém a modelagem UML e a implementação em Java de um componente iPhone, inspirado no lançamento oficial do primeiro iPhone em 2007. O projeto visa representar as funcionalidades principais do dispositivo por meio de interfaces e classes, promovendo o uso adequado de abstrações e princípios da programação orientada a objetos.

## 🎥 Contexto

Baseado no vídeo de lançamento do iPhone em 2007 (minutos 00:15 a 00:55), foram identificadas três funcionalidades principais:

- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador na Internet**

Cada funcionalidade foi representada por uma interface com métodos específicos, sendo implementadas em uma classe concreta `Iphone`.

---

## 🧩 Funcionalidades e Métodos

### 🎵 Reprodutor Musical (`ReprodutorMusical`)
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico (`AparelhoTelefonico`)
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador de Internet (`NavegadorInternet`)
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## 📊 Diagrama UML

O diagrama abaixo representa a estrutura do sistema com interfaces separadas para cada funcionalidade e uma única classe `Iphone` que implementa todas elas:

![Diagrama UML do iPhone](./assets/diagrama-iphone.png)

> 💡 As interfaces estão corretamente identificadas com `<<interface>>` e a implementação é feita por meio de setas pontilhadas com ponta triangular.