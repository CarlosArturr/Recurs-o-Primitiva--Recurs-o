;Fatorial padrão
(defn fatorial [n]
  (reduce * (range 1N (inc n))))

;Retorna o primeiro argumento passado como parametro
(defn P01 [y] y) 

;Retorna o segundo argumento y dos argumentos x, y, z
(defn P13 [x y z] y) 

;Retorna o segundo argumento y dos argumentos x, y, z
(defn P23 [x y z] z)

;Retorna o sucessor de n
(defn sucessor [n]
  (+ n 1))

;Função de produto
(defn multi [a b]
  (* a b))

;Função g conforme a definição formal
;g(x, y, z) = multi(P23(x, y, z), succ(P13(x, y, z))) 
(defn g [x y z]
  (multi (P23 x y z) (sucessor (P13 x y z))))

;Função h conforme a definição formal
(defn h [x y]
  (if (= y 0)
    1 ; h(x, 0) = const1(x)
    (g x (dec y) (h x (dec y))))) ;h(x, y + 1) = g(x, y, h(x, y))


;; Função Primitiva Fatorial 
(defn fac [y]
  (h y y))


(defn Main []
  (println "Digite um n para calcular n!:")
  (let [input (read-line)
        a (Integer/parseInt input)]
    (println "Fatorial Padrão:")
    (println (str  a "! = " (fatorial a)))
    (println "Fatorial Primitiva:")
    (println (str  a "! = " (fac a)))))

(Main)