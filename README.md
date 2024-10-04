# Recurs-o-Primitiva--Recurs-o

    Exemplo de recurção primitiva e u-recurção implementado em clojure.

#Exemplo de fatorial / Primitivo

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

#Função de Ackermann / u-Recurção

  
