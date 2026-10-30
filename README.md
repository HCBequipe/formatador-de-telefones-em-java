# Formatador e Detector de Telefones 📞

Aplicação desenvolvida em **Java 21** para higienização, identificação e formatação automatizada de números de telefone e celular, tratando desde entradas numéricas puras até textos com ruídos ou máscaras incorretas através de **Expressões Regulares (Regex)** e **Manipulação de Strings**.

---

## 📌 Funcionalidades e Regras de Validação

O sistema analisa a entrada digitada, higieniza os caracteres não numéricos e classifica o dispositivo de acordo com a quantidade de dígitos válidos:

### 1. **Formatos Suportados**

* **8 dígitos:** Telefone Fixo sem DDD (`XXXX-XXXX`)
* **9 dígitos:** Telefone Celular sem DDD (`XXXXX-XXXX`)
* **10 dígitos:** Telefone Fixo com DDD (`(XX)XXXX-XXXX`)
* **11 dígitos:** Telefone Celular com DDD (`(XX)XXXXX-XXXX`)

### 2. **Tratamento de Cenários e Situações**

* **Apenas Números:** Detecta o padrão pela quantidade de dígitos e aplica a máscara correspondente.
* **Quantidade Inválida de Dígitos:** Identifica entradas com menos de 8 ou mais de 11 dígitos numéricos e notifica que o número não é válido.
* **Número Já Formatado:** Confirma se a máscara está correta, mantém o formato e informa o tipo do dispositivo.
* **Máscara Incorreta ou Incompleta:** Corrige a formatação para o padrão oficial do sistema.
* **Entrada com Caracteres Mistos/Sujeira:** Remove símbolos e letras adicionais, extrai apenas os números e formata o resultado (ou invalida caso não alcance a quantidade de dígitos necessária).

---

## 🧠 Conceitos Práticos Aplicados

* **Limpeza com Regex (`replaceAll("\\D", "")`):** Remove qualquer caractere que não seja um dígito numérico ($0-9$).
* **Captura de Grupos (`replaceFirst`):** Utilização de expressões regulares com grupos de captura para remontar a String na máscara ideal (`($1)$2-$3`).
* **Validação de Padrões (`matches` e `equals`):** Verificação de consistência da entrada original comparada com a saída formatada.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21 (JDK 21)
* **IDE Recomendada:** IntelliJ IDEA
* **Versionamento:** Git & GitHub

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git

```


2. **Abra o projeto no IntelliJ IDEA**.
3. **Execute a classe principal:**
Navegue até `src/FormatadorTelefoneAvancado.java` e rode o método `main`.
4. **Exemplo de Testes no Console:**
* Entrada: `11988884444` $\rightarrow$ Retorna: `(11)98888-4444` *(Celular com DDD)*
* Entrada: `(11)3333-4444` $\rightarrow$ Retorna: `(11)3333-4444` *(Fixo com DDD - Já formatado)*
* Entrada: `Contato: 11-988884444!` $\rightarrow$ Retorna: `(11)98888-4444` *(Máscara corrigida/limpa)*



---

## ✒️ Autor

Desenvolvido por **[Vinicius Leandro]** durante os estudos de Java.
