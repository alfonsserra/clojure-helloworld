(ns helloworld.core)

(defn commasepared
  "Separate with commas"
  [names]
  (clojure.string/join ", " (map clojure.string/capitalize names)))

(defn greet
  "Say hello"
  [names]
  (println "Hello" (commasepared names)))

(defn -main
  "Main"
  []
  (let [x ["maria" "peter" "josh"]]
    (greet x)))
