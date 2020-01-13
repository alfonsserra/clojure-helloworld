(ns helloworld.core
  (:require [clojure.string :as str]))

(defn starts-with-vowel?
  "Check if starts with a vowel"
  [name]
  (contains? (set "AEIOU") (first name)))

(defn comma-separed
  "Separate names with commas"
  [names]
  (str/join ", " (filter starts-with-vowel? (map str/capitalize (map str/lower-case names)))))

(defn greet
  "Say hello"
  [names]
  (println "Hello" (comma-separed names)))

(defn -main
  "Main"
  []
  (let [x ["maria" "adele" "peter" "eva" "josh" "andy" "anthony"]]
    (greet x)))
