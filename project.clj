(defproject helloworld "0.1.0-SNAPSHOT"
  :description "Simple Hello world"
  :url "https://github.com/alfonsserra/clojure-helloworld"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns helloworld.core}
  :main helloworld.core)
