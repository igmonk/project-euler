(ns project-euler.core
  (:gen-class)
  (:require [project-euler.task1 :as task1]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (prn (task1/get-sum)))
