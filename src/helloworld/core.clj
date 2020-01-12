(ns helloworld.core)

(defn commasepared
  [names]
  (clojure.string/join ", " (map #(str % ) names)))

(defn greet
  "Say hello"
  [names]
  (println "Hello" (commasepared names)))

(defn -main
  "Main"
  []
  (greet ["Maria" "Peter" "Josh"]))
