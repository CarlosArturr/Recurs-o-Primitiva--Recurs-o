;Fução de Ackermann-Péter
(defn ackermann [m n]
  (cond (zero? m) (inc n)
        (zero? n) (ackermann (dec m) 1)
        :else (ackermann (dec m) (ackermann m (dec n)))))

(defn Main []
  (println "Digite um n e um m para calcular a função de Ackermann-Péter:")
  (let [input (read-line)
        n (Integer/parseInt input)
        input (read-line)
        m (Integer/parseInt input)]
    (println "Função Ackermann-Péter:")
    (println (str "A( "n" , "m") " " = " (ackermann n m)))))

(Main)