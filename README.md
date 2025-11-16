🪙 Conversor de Moedas — Alura ONE Brasil

Projeto desenvolvido como parte do Challenge One - Lógica de Programação da Oracle + Alura.
O objetivo é criar um conversor capaz de transformar valores entre diferentes moedas usando Java, boas práticas de programação e organização de código.

📌 Sobre o Projeto

Este projeto implementa um conversor de moedas em Java que:

Exibe um menu interativo ao usuário;

Permite escolher entre diferentes tipos de conversão;

Realiza cálculos com base em taxas de câmbio;

Exibe o resultado de forma clara e formatada.

📋 Funcionalidades

O menu disponibiliza as seguintes opções:

Dólar Americano → Real Brasileiro

Real Brasileiro → Dólar Americano

Peso Argentino → Real Brasileiro

Real Brasileiro → Peso Argentino

Peso Argentino → Dólar Americano

Dólar Americano → Peso Argentino

🧠 Lógica Utilizada

Entrada de dados via Scanner

Estruturas condicionais para seleção do tipo de conversão

Uso de multiplicação/divisão para aplicar taxas de câmbio atualizadas manualmente

Saída formatada com duas casas decimais

Estrutura modular com métodos para cada conversão (opcional)

🛠️ Tecnologias

Java 17+

IDE de preferência (Eclipse, IntelliJ, VS Code, etc.)

▶️ Como Executar

Instale o JDK 17 ou superior.

Clone este repositório:

git clone https://github.com/seu-usuario/seu-repositorio


Compile o projeto:

javac Main.java


Execute:

java Main

📄 Exemplo de Menu Usado no Projeto
String menu = """
**************************************
Selecione um tipo de conversão:

1. Dólar Americano -> Real Brasileiro
2. Real Brasileiro -> Dólar Americano
3. Peso Argentino -> Real Brasileiro
4. Real Brasileiro -> Peso Argentino
5. Peso Argentino -> Dólar Americano
6. Dólar Americano -> Peso Argentino
**************************************
""";

📚 Aprendizados do Desafio

Este desafio reforçou conceitos essenciais:

Estrutura básica de um programa Java

Entrada e saída de dados

Condicionais e cálculos matemáticos

Manipulação de texto e menus interativos

Organização de código e boas práticas
