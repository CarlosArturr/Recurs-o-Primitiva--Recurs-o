# Recurs-o-Primitiva--Recurs-o

    Exemplo de recurção primitiva e u-recurção implementado em clojure.

# Exemplo de fatorial / Primitivo

    A função fatorial fac(x) = x! = 1 * 2 * 3 . . . . . * x

    Definição intuitiva:
    fac(0) = 1
    fac(𝑦 + 1) = fac(𝑦) . (𝑦 + 1)


    Definição de dois argumentos h
    h(x, 0) = const1(x)
    h(x, y + 1) = g(x, y, h(x, y))

    onde:
     g(x, y, z) = multi(P23(x, y, z), succ(P13(x, y, z))) 

    e então definir:
    fac(y) = h(P01(y), P01(y)) = h(y, y).

# Função de Ackermann / u-Recurção

         Todo função primitiva recursiva é uma função computável total, mas nem toda função computável total é primitiva recursiva.
  
        As funções primitivas recursivas formam um subconjunto das funções computáveis totais. As funções computáveis totais incluem funções que requerem formas mais poderosas de recursão além da recursão primitiva.

# Exemplo a função de Ackermann

![Ackermann](https://github.com/user-attachments/assets/7b45cfba-6100-4d8d-8ee1-f36f22d7df07)

# função de Ackermann-Peter

![Ackerman-Peter](https://github.com/user-attachments/assets/f113540b-e49d-45f9-bdf0-b91577a1b544)

Características das funções:
  
    | **Aspecto**                       | **Funções Primitivas Recursivas**                              | **Funções Computáveis Totais**                                        |
    |-----------------------------------|----------------------------------------------------------------|---------------------------------------------------------------------- |
    | **Definição**                     | Definidas por funções básicas, composição e recursão primitiva | Incluem todas as funções primitivas recursivas e outras mais complexas|
    | **Exemplos**                      | Fatorial, Soma, Produto                                        | Função de Ackermann, Funcões que utilizam recursão geral              |
    | **Crescimento**                   | Limitado, geralmente linear ou polinomial                      | Podem crescer exponencialmente ou ainda mais rápido                   |
    | **Expressividade**                | Menor, apenas funções com recursão primitiva                   | Maior, incluindo funções com recursão aninhada                        |
    | **Terminação**                    | Sempre terminam                                                | Sempre terminam, mas com formas de recursão mais complexas            |
    | **Aplicações**                    | Computação simples, matemática básica                          | Teoria da computação, demonstrar limites da recursividade             |
  
# REFERENCIAS
        https://builds.openlogicproject.org/content/computability/recursive-functions/examples.pdf
        
