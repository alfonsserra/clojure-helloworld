(ns helloworld.core)

(defn greet
  "Say hello to a person"
  [name]
  (println "Hello," name))

(defn -main
  "Main"
  []
  (greet "Maria"))
