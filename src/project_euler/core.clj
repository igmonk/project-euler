(ns project-euler.core
  (:gen-class)
  (:require [project-euler.task1 :as task1])
  (:require [project-euler.task2 :as task2]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (prn (task2/even-fibs)))
