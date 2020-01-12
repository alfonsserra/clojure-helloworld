(ns helloworld.core
  (:require [clojure.string :as str]))

(defn startsWithVowel?
  [name]
  (contains? (set "AEIOU") (first name)))

(defn commasepared
  "Separate with commas"
  [names]
  (str/join ", " (filter startsWithVowel? (map str/capitalize names))))

(defn greet
  "Say hello"
  [names]
  (println "Hello" (commasepared names)))

(defn -main
  "Main"
  []
  (let [x ["maria" "adele" "peter" "eva" "josh" "andy" "anthony"]]
    (greet x)))
